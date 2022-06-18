package simulations.jdbc.delayed

import com.typesafe.config.Config
import io.gatling.core.Predef._
import io.gatling.core.scenario.Simulation
import io.gatling.core.structure.ScenarioBuilder
import ru.tinkoff.load.jdbc.Predef._
import ru.tinkoff.load.jdbc.protocol.JdbcProtocolBuilder
import simulations.ConfExtractor

import scala.concurrent.duration._
import scala.language.postfixOps

class TestJDBCFeeder250UsersAndDelayedSimulation extends Simulation {

  val config: Config = ConfExtractor.configGetter("database")

  val dataBase: JdbcProtocolBuilder = DB
    .url(config.getString("url"))
    .username(config.getString("username"))
    .password(config.getString("password"))

  val scn: ScenarioBuilder = scenario("250 users Select all client and product")
    .exec(jdbc("select client").query("SELECT * FROM client"))
    .exec(jdbc("select product").query("SELECT * FROM product"))

  setUp(
    scn.inject(rampUsers(250) during(10 seconds)),
  ).protocols(dataBase)
    .maxDuration(60)
}
