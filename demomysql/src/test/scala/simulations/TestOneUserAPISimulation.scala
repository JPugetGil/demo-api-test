package simulations

import io.gatling.core.Predef._
import io.gatling.core.scenario.Simulation
import io.gatling.core.structure.ScenarioBuilder
import io.gatling.http.Predef._
import io.gatling.http.protocol.HttpProtocolBuilder

class TestOneUserAPISimulation extends Simulation {
   // http conf
   val httpConf: HttpProtocolBuilder = http.baseUrl("http://localhost:8080")
     .header("Accept", value="application/json")
     .header("content-type", value="application/json")

   // scenario
   val scn: ScenarioBuilder = scenario("Get all clients with one user")
     .exec(http("get all clients request with one user")
       .get("/clients")
       .check(status is 200)
     )
     .exec(
       http("get all products request with one user")
         .get("/products")
         .check(status is 200)
     )

   // setup
   setUp(scn.inject(atOnceUsers(1))).protocols(httpConf)
}