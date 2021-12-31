package simulations

import io.gatling.core.Predef.*
import io.gatling.core.scenario.Simulation
import io.gatling.core.structure.ScenarioBuilder
import io.gatling.http.Predef.*
import io.gatling.http.protocol.HttpProtocolBuilder

class TestAPISimulation extends Simulation {
   // http conf
   val httpConf: HttpProtocolBuilder = http.baseUrl("http://localhost:8081")
     .header("Accept", value="application/json")
     .header("content-type", value="application/json")

   // scenario
   val scn: ScenarioBuilder = scenario("Get all clients")
     .exec(http("get all clients request")
       .get("/clients")
       .check(status is 200)
     )

   // setup
   setUp(scn.inject(atOnceUsers(1))).protocols(httpConf)
}