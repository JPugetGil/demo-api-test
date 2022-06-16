package simulations.spring.delayed

import com.typesafe.config.Config
import io.gatling.core.Predef._
import io.gatling.core.scenario.Simulation
import io.gatling.core.structure.ScenarioBuilder
import io.gatling.http.Predef._
import io.gatling.http.protocol.HttpProtocolBuilder
import simulations.ConfExtractor

import scala.concurrent.duration._
import scala.language.postfixOps

class Test50UsersAndDelayedAPISimulation extends Simulation {

  val config: Config = ConfExtractor.configGetter("api")

  // http conf
   val httpConf: HttpProtocolBuilder = http.baseUrl(config.getString("url"))
     .header("Accept", value="application/json")
     .header("content-type", value="application/json")

   // scenario
   val scn: ScenarioBuilder = scenario("Get all clients with 50 users")
     .exec(http("get all clients request with 50 users")
       .get("/clients")
       .check(status is 200)
     )
     .exec(
       http("get all products request with 50 users")
         .get("/products")
         .check(status is 200)
     )

   // setup
   setUp(scn.inject(rampUsers(50) during(10 seconds))).protocols(httpConf)
}