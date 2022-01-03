package simulations

import io.gatling.core.Predef._
import io.gatling.core.scenario.Simulation
import io.gatling.core.structure.ScenarioBuilder
import io.gatling.http.Predef._
import io.gatling.http.protocol.HttpProtocolBuilder

class Test50UsersAPISimulation extends Simulation {
   // http conf
   val httpConf: HttpProtocolBuilder = http.baseUrl("http://localhost:8080")
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
   setUp(scn.inject(atOnceUsers(50))).protocols(httpConf)
}