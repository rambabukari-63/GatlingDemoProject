package videogamedb.gameDb;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import java.security.PrivateKey;
import java.time.Duration;
import java.util.List;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class AuthenticationInGatling extends Simulation{

    private HttpProtocolBuilder httpProtocol = http
            .baseUrl("https://videogamedb.uk/api")
            .acceptHeader("application/json")
            .contentTypeHeader("application/json");

    private static ChainBuilder authrnticate =
    exec(http("Authenticate")
            .post("/authenticate")
            .body(StringBody("{\n" +
                    "  \"password\": \"admin\",\n" +
                    "  \"username\": \"admin\"\n" +
                    "}"))
            .check(jmesPath("token").saveAs("jwtToken")));

    private static ChainBuilder createNewGame =
            exec(http("Create new game")
                    .post("/videogame")
                    .header("Authorization", "Bearer #{jwtToken}")
                    .body(StringBody("{\n" +
                            "  \"category\": \"Platform\",\n" +
                            "  \"name\": \"Mario\",\n" +
                            "  \"rating\": \"Mature\",\n" +
                            "  \"releaseDate\": \"2012-05-04\",\n" +
                            "  \"reviewScore\": 85\n" +
                            "}")));
    private static ChainBuilder getSpecificVideoGame=
            repeat(5, "myCounter").on(
                    exec(http("Get all Specific game")
                            .get("/videogame/1")
                            .check(status().is(200))));


    private ScenarioBuilder scn = scenario("Video Game Db - Section 5 code")
            .exec(authrnticate)
            .exec(createNewGame);


    {
        setUp(
                scn.injectOpen(atOnceUsers(1))
        ).protocols(httpProtocol);
    }
}
