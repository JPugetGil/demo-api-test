package simulations.spring

import io.gatling.core.Predef._
import io.gatling.core.scenario.Simulation
import io.gatling.core.structure.ScenarioBuilder
import io.gatling.http.Predef._
import io.gatling.http.protocol.HttpProtocolBuilder

import scala.concurrent.duration._
import scala.language.postfixOps

class Test1000UsersAndDelayedAPISimulation extends Simulation {
   // http conf
   val httpConf: HttpProtocolBuilder = http.baseUrl("http://localhost:8081")
     .header("Accept", value="application/json")
     .header("content-type", value="application/json")

   // scenario
   val scn: ScenarioBuilder = scenario("Get all clients with 1000 users")
     .exec(http("get all clients request with 1000 users")
       .get("/clients")
       .check(status is 200)
     )
     .exec(
       http("get all products request with 1000 users")
         .get("/products")
         .check(status is 200)
     )

   // setup
   setUp(scn.inject(rampUsers(1000) during(10 seconds))).protocols(httpConf)
}