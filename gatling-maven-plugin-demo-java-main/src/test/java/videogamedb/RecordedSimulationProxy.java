package videogamedb;

import java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.javaapi.jdbc.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

public class RecordedSimulationProxy extends Simulation {

  private HttpProtocolBuilder httpProtocol = http
    .baseUrl("https://videogamedb.uk")
    .inferHtmlResources(AllowList(), DenyList(".*\\.js", ".*\\.css", ".*\\.gif", ".*\\.jpeg", ".*\\.jpg", ".*\\.ico", ".*\\.woff", ".*\\.woff2", ".*\\.(t|o)tf", ".*\\.png", ".*\\.svg", ".*detectportal\\.firefox\\.com.*"))
    .acceptHeader("*/*")
    .acceptEncodingHeader("gzip, deflate")
    .userAgentHeader("PostmanRuntime/7.31.1");
  
  private Map<CharSequence, String> headers_0 = Map.of("Postman-Token", "0d4eb874-38e9-4708-a14d-96c2f2fe4281");
  
  private Map<CharSequence, String> headers_1 = Map.of("Postman-Token", "f451d57f-8f46-4157-8137-097e1afa306d");
  
  private Map<CharSequence, String> headers_2 = Map.of("Postman-Token", "9fc325f1-1ad4-46cb-8a21-dd1d074b5927");
  
  private Map<CharSequence, String> headers_3 = Map.ofEntries(
    Map.entry("Content-Type", "application/json"),
    Map.entry("Postman-Token", "6094ed61-ac54-4324-9419-09e9b84fd932"),
    Map.entry("authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZG1pbiIsImlhdCI6MTY3ODg5NzMwMSwiZXhwIjoxNjc4OTAwOTAxfQ.Q9jyBaToPQfrvt-OqsFsF0p9BbjP7SgYntqTUkBKXRw")
  );
  
  private Map<CharSequence, String> headers_4 = Map.ofEntries(
    Map.entry("Content-Type", "application/json"),
    Map.entry("Postman-Token", "d4d1a0fa-a25c-45b8-b558-af60618a7279"),
    Map.entry("authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZG1pbiIsImlhdCI6MTY3ODg5NzMwMSwiZXhwIjoxNjc4OTAwOTAxfQ.Q9jyBaToPQfrvt-OqsFsF0p9BbjP7SgYntqTUkBKXRw")
  );
  
  private Map<CharSequence, String> headers_5 = Map.ofEntries(
    Map.entry("Postman-Token", "f6367c31-e053-4a7b-9ad5-1469516ed32c"),
    Map.entry("authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZG1pbiIsImlhdCI6MTY3ODg5NzMwMSwiZXhwIjoxNjc4OTAwOTAxfQ.Q9jyBaToPQfrvt-OqsFsF0p9BbjP7SgYntqTUkBKXRw")
  );
  
  private Map<CharSequence, String> headers_6 = Map.ofEntries(
    Map.entry("Content-Type", "application/json"),
    Map.entry("Postman-Token", "e42a96a6-e154-40ee-80a1-37b467635148")
  );


  private ScenarioBuilder scn = scenario("RecordedSimulationProxy")
    .exec(
      http("request_0")
        .get("/api/videogame")
        .headers(headers_0)
    )
    .pause(197)
    .exec(
      http("request_1")
        .get("/api/videogame/2")
        .headers(headers_1)
    )
    .pause(773)
    .exec(
      http("request_2")
        .get("/api/videogame/2")
        .headers(headers_2)
    )
    .pause(5)
    .exec(
      http("request_3")
        .post("/api/videogame")
        .headers(headers_3)
        .body(RawFileBody("videogamedb/recordedsimulationproxy/0003_request.json"))
    )
    .pause(28)
    .exec(
      http("request_4")
        .put("/api/videogame/3")
        .headers(headers_4)
        .body(RawFileBody("videogamedb/recordedsimulationproxy/0004_request.json"))
    )
    .pause(8)
    .exec(
      http("request_5")
        .delete("/api/videogame/2")
        .headers(headers_5)
    )
    .pause(6)
    .exec(
      http("request_6")
        .post("/api/authenticate")
        .headers(headers_6)
        .body(RawFileBody("videogamedb/recordedsimulationproxy/0006_request.json"))
    );

  {
	  setUp(scn.injectOpen(atOnceUsers(1))).protocols(httpProtocol);
  }
}
