package simulations.jdbc.direct

import com.typesafe.config.Config
import io.gatling.core.Predef._
import io.gatling.core.scenario.Simulation
import io.gatling.core.structure.ScenarioBuilder
import ru.tinkoff.load.jdbc.Predef._
import ru.tinkoff.load.jdbc.protocol.JdbcProtocolBuilder
import simulations.ConfExtractor

class TestJDBCFeeder1UserSimulation extends Simulation {

  val config: Config = ConfExtractor.configGetter("database")

  val dataBase: JdbcProtocolBuilder = DB
    .url(config.getString("url"))
    .username(config.getString("username"))
    .password(config.getString("password"))

  val scn: ScenarioBuilder = scenario("1 user Select all client and product")
    .exec(jdbc("select client").query("SELECT * FROM client"))
    .exec(jdbc("select product").query("SELECT * FROM product"))

  setUp(
    scn.inject(atOnceUsers(1)),
  ).protocols(dataBase)
    .maxDuration(60)
}
