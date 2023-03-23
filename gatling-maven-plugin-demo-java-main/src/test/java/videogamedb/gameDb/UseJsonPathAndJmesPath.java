package videogamedb.gameDb;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import java.time.Duration;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class UseJsonPathAndJmesPath extends Simulation {

    private HttpProtocolBuilder httpProtocol = http
            .baseUrl("https://videogamedb.uk/api")
            .acceptHeader("application/json");

    private ScenarioBuilder scn = scenario("Video Game Db - Section 5 code")
            .exec(http("Get all video games - 1st call")
                    .get("/videogame")
                    .check(status().is(200))
                    .check(jsonPath("$[?(@.id==2)].name").is("Gran Turismo 3")))
/*
[or]
            .check(jmesPath("[? name == 'Resident Evil 4'].category").ofList().is(List.of("Shooter")))
*/
            .pause(5)

            .exec(http("")
                    .get("/videogame/1")
                    .check(status().in(200, 201, 202)))
            .pause(1,10)

            .exec(http("Get all video games - 2nd call")
                    .get("/videogame")
                    .check(status().not(404), status().not(500)))
            .pause(Duration.ofMillis(4000));
    {
        setUp(
                scn.injectOpen(atOnceUsers(1))
        ).protocols(httpProtocol);
    }
}