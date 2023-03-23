package computerdatabase;

import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class Flipkart extends Simulation {

  private HttpProtocolBuilder httpProtocol = http
    .baseUrl("https://1.rome.api.flipkart.com")
    .inferHtmlResources(AllowList(), DenyList(".*\\.js", ".*\\.css", ".*\\.gif", ".*\\.jpeg", ".*\\.jpg", ".*\\.ico", ".*\\.woff", ".*\\.woff2", ".*\\.(t|o)tf", ".*\\.png", ".*\\.svg", ".*detectportal\\.firefox\\.com.*", ".*\\.js", ".*\\.css", ".*\\.gif", ".*\\.jpeg", ".*\\.jpg", ".*\\.ico", ".*\\.woff", ".*\\.woff2", ".*\\.(t|o)tf", ".*\\.png", ".*\\.svg", ".*detectportal\\.firefox\\.com.*"))
  ;
  
  private Map<CharSequence, String> headers_0 = Map.ofEntries(
    Map.entry("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36"),
    Map.entry("sec-ch-ua", "Google Chrome\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows")
  );
  
  private Map<CharSequence, String> headers_14 = Map.ofEntries(
    Map.entry("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7"),
    Map.entry("Accept-Encoding", "gzip, deflate, br"),
    Map.entry("Accept-Language", "en-US,en;q=0.9"),
    Map.entry("Cache-Control", "max-age=0"),
    Map.entry("Sec-Fetch-Dest", "document"),
    Map.entry("Sec-Fetch-Mode", "navigate"),
    Map.entry("Sec-Fetch-Site", "cross-site"),
    Map.entry("Sec-Fetch-User", "?1"),
    Map.entry("Upgrade-Insecure-Requests", "1"),
    Map.entry("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36"),
    Map.entry("sec-ch-ua", "Google Chrome\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows")
  );
  
  private Map<CharSequence, String> headers_15 = Map.ofEntries(
    Map.entry("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8"),
    Map.entry("Accept-Encoding", "gzip, deflate, br"),
    Map.entry("Accept-Language", "en-US,en;q=0.9"),
    Map.entry("Sec-Fetch-Dest", "image"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "cross-site"),
    Map.entry("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36"),
    Map.entry("sec-ch-ua", "Google Chrome\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows")
  );
  
  private Map<CharSequence, String> headers_29 = Map.ofEntries(
    Map.entry("Accept", "*/*"),
    Map.entry("Accept-Encoding", "gzip, deflate, br"),
    Map.entry("Accept-Language", "en-US,en;q=0.9"),
    Map.entry("Content-Type", "application/json"),
    Map.entry("Origin", "https://www.flipkart.com"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-site"),
    Map.entry("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36"),
    Map.entry("X-User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36 FKUA/website/42/website/Desktop"),
    Map.entry("sec-ch-ua", "Google Chrome\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows")
  );
  
  private Map<CharSequence, String> headers_32 = Map.ofEntries(
    Map.entry("accept", "*/*"),
    Map.entry("accept-encoding", "gzip, deflate, br"),
    Map.entry("accept-language", "en-US,en;q=0.9"),
    Map.entry("content-type", "text/plain;charset=UTF-8"),
    Map.entry("origin", "https://www.flipkart.com"),
    Map.entry("sec-ch-ua", "Google Chrome\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-fetch-dest", "empty"),
    Map.entry("sec-fetch-mode", "cors"),
    Map.entry("sec-fetch-site", "cross-site"),
    Map.entry("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36")
  );
  
  private Map<CharSequence, String> headers_33 = Map.ofEntries(
    Map.entry("accept", "*/*"),
    Map.entry("accept-encoding", "gzip, deflate, br"),
    Map.entry("accept-language", "en-US,en;q=0.9"),
    Map.entry("origin", "https://www.flipkart.com"),
    Map.entry("sec-ch-ua", "Google Chrome\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-fetch-dest", "empty"),
    Map.entry("sec-fetch-mode", "cors"),
    Map.entry("sec-fetch-site", "cross-site"),
    Map.entry("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36")
  );
  
  private Map<CharSequence, String> headers_34 = Map.ofEntries(
    Map.entry("accept", "*/*"),
    Map.entry("accept-encoding", "gzip, deflate, br"),
    Map.entry("accept-language", "en-US,en;q=0.9"),
    Map.entry("content-type", "multipart/form-data; boundary=----------------mzjfrtvugdwwxpec"),
    Map.entry("origin", "https://www.flipkart.com"),
    Map.entry("sec-ch-ua", "Google Chrome\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-fetch-dest", "empty"),
    Map.entry("sec-fetch-mode", "cors"),
    Map.entry("sec-fetch-site", "cross-site"),
    Map.entry("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36")
  );
  
  private Map<CharSequence, String> headers_35 = Map.ofEntries(
    Map.entry("Accept", "*/*"),
    Map.entry("Accept-Encoding", "gzip, deflate, br"),
    Map.entry("Accept-Language", "en-US,en;q=0.9"),
    Map.entry("Sec-Fetch-Dest", "script"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "cross-site"),
    Map.entry("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36"),
    Map.entry("sec-ch-ua", "Google Chrome\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows")
  );
  
  private Map<CharSequence, String> headers_39 = Map.ofEntries(
    Map.entry("Accept", "*/*"),
    Map.entry("Accept-Encoding", "gzip, deflate, br"),
    Map.entry("Accept-Language", "en-US,en;q=0.9"),
    Map.entry("Origin", "https://www.flipkart.com"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "cross-site"),
    Map.entry("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36"),
    Map.entry("content-type", "text/plain"),
    Map.entry("sec-ch-ua", "Google Chrome\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows")
  );
  
  private Map<CharSequence, String> headers_41 = Map.ofEntries(
    Map.entry("Accept", "*/*"),
    Map.entry("Accept-Encoding", "gzip, deflate, br"),
    Map.entry("Accept-Language", "en-US,en;q=0.9"),
    Map.entry("Access-Control-Request-Headers", "content-type,x-user-agent"),
    Map.entry("Access-Control-Request-Method", "POST"),
    Map.entry("Origin", "https://www.flipkart.com"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-site"),
    Map.entry("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36")
  );
  
  private Map<CharSequence, String> headers_46 = Map.ofEntries(
    Map.entry("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8"),
    Map.entry("accept-encoding", "gzip, deflate, br"),
    Map.entry("accept-language", "en-US,en;q=0.9"),
    Map.entry("sec-ch-ua", "Google Chrome\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-fetch-dest", "image"),
    Map.entry("sec-fetch-mode", "no-cors"),
    Map.entry("sec-fetch-site", "cross-site"),
    Map.entry("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36")
  );
  
  private Map<CharSequence, String> headers_188 = Map.ofEntries(
    Map.entry("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8"),
    Map.entry("accept-encoding", "gzip, deflate, br"),
    Map.entry("accept-language", "en-US,en;q=0.9"),
    Map.entry("sec-ch-ua", "Google Chrome\";v=\"111\", \"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"111"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-fetch-dest", "image"),
    Map.entry("sec-fetch-mode", "no-cors"),
    Map.entry("sec-fetch-site", "cross-site"),
    Map.entry("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36"),
    Map.entry("x-client-data", "CJe2yQEIpbbJAQjEtskBCKmdygEI2YLLAQiUocsBCJz+zAEI5JfNAQ==")
  );
  
  private String uri01 = "https://rukminim1.flixcart.com";
  
  private String uri02 = "https://www.facebook.com/tr";
  
  private String uri04 = "https://www.googletagmanager.com/gtag/js";
  
  private String uri05 = "https://flipkart.d1.sc.omtrdc.net/b/ss/flipkart-prd/1/JS-1.5.1";
  
  private String uri06 = "https://www.google.co.in/pagead/1p-user-list";
  
  private String uri07 = "https://collector-pxgnttli3a.px-cloud.net/api/v2/collector";
  
  private String uri08 = "https://b.px-cdn.net/api/v1/PXgNtTli3A/d/p";
  
  private String uri09 = "https://www.googleadservices.com/pagead/conversion/1017598645";
  
  private String uri10 = "https://bam.nr-data.net";
  
  private String uri11 = "https://rome.api.flipkart.com/api";
  
  private String uri12 = "https://www.flipkart.com";

  private ScenarioBuilder scn = scenario("RecordedSimulation")
    .exec(
      http("request_0")
        .get(uri01 + "/fk-p-flap/844/140/image/68aaa1478200e995.jpg?q=50")
        .headers(headers_0)
        .resources(
          http("request_1")
            .get(uri01 + "/fk-p-flap/100/100/image/e7ae677570a7b218.jpg?q=50")
            .headers(headers_0),
          http("request_2")
            .get(uri01 + "/image/400/400/ktop5e80/tablet/x/9/o/mk2k3hn-a-apple-original-imag6yy7xjjugz4w.jpeg?q=70")
            .headers(headers_0),
          http("request_3")
            .get(uri01 + "/image/400/400/kerfl3k0pkrrdj/bottle/y/y/b/rkh-pacific-1000-ml-black-milton-original-imafvd68eypr92af.jpeg?q=70")
            .headers(headers_0),
          http("request_4")
            .get(uri01 + "/image/400/400/kvba7bk0/shoe/x/b/p/-original-imag88gaxkksgrnp.jpeg?q=70")
            .headers(headers_0),
          http("request_5")
            .get(uri01 + "/image/400/400/kl5hh8w0/fabric/3/o/z/yes-unstitched-parth-dres-flower-60-spela-original-imagycdjqncupcee.jpeg?q=70")
            .headers(headers_0),
          http("request_6")
            .get(uri01 + "/image/400/400/kekadu80/screen-guard/edge-to-edge-tempered-glass/y/y/z/flipkart-smartbuy-mr9-mtb-original-imafv85ze4faacfg.jpeg?q=70")
            .headers(headers_0),
          http("request_7")
            .get(uri01 + "/image/400/400/kpvivm80/tablet/n/t/v/sm-t225nzsains-samsung-original-imag4yryasv6s7h3.jpeg?q=70")
            .headers(headers_0),
          http("request_8")
            .get(uri01 + "/image/400/400/ktn9pjk0/suitcase/h/d/m/gamma-gamma754wtea-check-in-luggage-safari-original-imag6y3jmyxwyabs.jpeg?q=70")
            .headers(headers_0),
          http("request_9")
            .get(uri01 + "/image/400/400/l0igvww0/air-cooler/y/s/8/-original-imagcafejfweqhy3.jpeg?q=70")
            .headers(headers_0),
          http("request_10")
            .get(uri01 + "/fk-p-flap/50/50/image/7767f053f3abf622.jpg?q=50")
            .headers(headers_0),
          http("request_11")
            .get(uri01 + "/fk-p-flap/50/50/image/90c3b822d824724b.jpg?q=50")
            .headers(headers_0),
          http("request_12")
            .get(uri01 + "/fk-p-flap/50/50/image/ed554cd441e63636.jpg?q=50")
            .headers(headers_0),
          http("request_13")
            .get(uri04 + "?id=AW-594691041"),
          http("request_14")
            .get(uri12 + "/")
            .headers(headers_14),
          http("request_15")
            .get(uri01 + "/fk-p-flap/464/708/image/08ee370931a1fd39.jpeg?q=70")
            .headers(headers_15),
          http("request_16")
            .get(uri01 + "/fk-p-flap/128/128/image/47e5c31ef7dcce1e.png?q=100")
            .headers(headers_0),
          http("request_17")
            .get(uri01 + "/fk-p-flap/128/128/image/5f8bd5669e19e724.png?q=100")
            .headers(headers_0),
          http("request_18")
            .get(uri01 + "/fk-p-flap/128/128/image/361d53b8725c2d2d.png?q=100")
            .headers(headers_0),
          http("request_19")
            .get(uri01 + "/fk-p-flap/128/128/image/904f3c8e7101408b.png?q=100")
            .headers(headers_0),
          http("request_20")
            .get(uri01 + "/fk-p-flap/128/128/image/7f7355480c6adc16.png?q=100")
            .headers(headers_0),
          http("request_21")
            .get(uri01 + "/fk-p-flap/128/128/image/f97d6138516056bc.png?q=100")
            .headers(headers_0),
          http("request_22")
            .get(uri01 + "/fk-p-flap/128/128/image/6728ed3cf145562c.png?q=100")
            .headers(headers_0),
          http("request_23")
            .get(uri01 + "/fk-p-flap/128/128/image/007910082ae6355b.png?q=100")
            .headers(headers_0),
          http("request_24")
            .get(uri01 + "/fk-p-flap/128/128/image/46376ceed3448aff.png?q=100")
            .headers(headers_0),
          http("request_25")
            .get(uri01 + "/fk-p-flap/278/278/image/0b22f4bdbe5b032a.jpg?q=90")
            .headers(headers_0),
          http("request_26")
            .get(uri01 + "/fk-p-flap/50/50/image/dafaa0c454cd5c8b.jpg?q=50")
            .headers(headers_0),
          http("request_27")
            .get(uri01 + "/fk-p-flap/50/50/image/d0eaf46130be23e4.jpg?q=50")
            .headers(headers_0),
          http("request_28")
            .get(uri01 + "/fk-p-flap/50/50/image/86fc46167e92a7ca.jpg?q=50")
            .headers(headers_0),
          http("request_29")
            .post(uri11 + "/1/fdp")
            .headers(headers_29)
            .body(RawFileBody("computerdatabase/recordedsimulation/0029_request.json")),
          http("request_30")
            .get(uri01 + "/fk-p-flap/3376/560/image/68aaa1478200e995.jpg?q=50")
            .headers(headers_0),
          http("request_31")
            .get(uri01 + "/fk-p-flap/2000/2000/image/e7ae677570a7b218.jpg?q=50")
            .headers(headers_0),
          http("request_32")
            .post(uri05 + "/s21039123553775")
            .headers(headers_32)
            .body(RawFileBody("computerdatabase/recordedsimulation/0032_request.gif")),
          http("request_33")
            .post(uri07)
            .headers(headers_33)
            .formParam("payload", "aUkQRhAIEGJqAwAGAgYQHhBWEAhJEGJqAwACBwAQCAsDAx4QYmoDAwsCABAIAh4QYmoDAwcEAhAICwMDHhBiagMAAAoCEAgDBAUKCgoHBQUFAQMLHhBiagMDBgsEEAgQUwEBBQoFVwIfUQEBAB8DA1dWH1ALBVMfBlBQBVAKAAADUFRWEB4QYmoDAAcEBhAIXEdeXh4QYmoDAAcEBxAIHwMeEGJqAwMBBQsQCFRTXkFXHhBiagMDBAYHEAgQWkZGQkEIHR1FRUUcVF5bQllTQEYcUV1fHRBPTx5JEEYQCBBiagMABgIGEB4QVhAISRBiagMDBQsHEAgHAx4QYmoDAwsCABAIAx4QYmoDAwcEAhAICwQBHhBiagMAAAoCEAgDBAUKCgoHBQUFAQACHhGBiagMD^BgsEEAgQUwEBBQoFVwIfUQEBAB8DA1dWH1ALBVMfBlBQBVAKAAADUFRWEB4QYmoDAAcEBShAIXEdeXh4QYmoDAAcEBx}DNAIHwMeEGJqAwMBBQsQCFRTXkFKXT08eSRBGEAgQYmoDAAILBxAeEFYQCEkQY8moDAwQGBxAIEFpGRkJBCDNB0dRUVFHFReW0JZU0BGHFFdXx0QHhBiagMAAAIFEAgCHhBiagMABgcKEAgQZVtcAQAQHhBiagMDCa>wIAEAgAHhBiagMDBwQCEAgLBQQeEGJqAwADABgoQCAEEAgIeEGJqAwMBCgcQCAMEBQoKCgcFBQUABgseEGJqAwAACgIQCAMEBQoKCgcF`BQUBAAIeEGJqAwMGCwQQCK}GKBBTAQEFCgV7XAh9RAQEAHwMDV1YfUAsFUx8GUFAFUAoAAANQVFYQHhBiagMABwQGEAhcR15eHhBiagMABwQHEAgfAx4QYmo7DAwEFCxAIVFNeQVdPT28=")
            .formParam("appId", "PXgNtTli3A")
            .formParam("tag", "v8.2.9-HF")
            .formParam("uuid", "a33787e0-c332-11ed-b97a-4bb7b8221bfd")
            .formParam("ft", "297")
            .formParam("seq", "0")
            .formParam("en", "NTA")
            .formParam("pc", "3509323663211871")
            .formParam("sid", "9356b052-c332-11ed-89e4-6c6249477044")
            .formParam("vid", "9356a6c7-c332-11ed-89e4-6c6249477044")
            .formParam("cts", "9356b4ef-c332-11ed-89e4-6c6249477044")
            .formParam("rsc", "1"),
          http("request_34")
            .post(uri08)
            .headers(headers_34)
            .body(RawFileBody("computerdatabase/recordedsimulation/0034_request.json")),
          http("request_35")
            .get(uri10 + "/1/NRJS-dd5f16cdf95712c6cba?a=1588759528&sa=1&v=1216.487a282&t=Unnamed%20Transaction&rst=1299&ck=1&ref=https://www.flipkart.com/&be=322&fe=1050&dc=659&af=err,xhr,stn,ins,spa&perf=%7B%22timing%22:%7B%22of%22:1678885776344,%22n%22:0,%22u%22:266,%22ue%22:266,%22f%22:2,%22dn%22:11,%22dne%22:11,%22c%22:11,%22s%22:34,%22ce%22:72,%22rq%22:72,%22rp%22:255,%22rpe%22:314,%22dl%22:271,%22di%22:510,%22ds%22:659,%22de%22:659,%22dc%22:1049,%22l%22:1049,%22le%22:1052%7D,%22navigation%22:%7B%22ty%22:1%7D%7D&fp=335&fcp=489&ja=%7B%22releaseId%22:%225.22.1%22,%22deviceId%22:%22TI167888574803700101144290401990266586728005337745041014716164901284%22%7D&jsonp=NREUM.setToken")
            .headers(headers_35),
          http("request_36")
            .post(uri07)
            .headers(headers_33)
            .formParam("payload", "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^VeVxJxWkBdX1cQHhBEV0BBW11cEAgQAwMDEE8eSRBQQFNcVhAIEHxdRhpzCHBAU1xWEB4QRFdAQVtdXBAIEAoQTx5JEFBAU1xWEAgQcVpAXV9bR18QHhBEV0BBW11cEAgQAwMDEE9vHhBiagMABwILEAhUU15BVx4QYmoDAAcDAhAIEBAeEGJqAwAHAwMQCBBlW1xWXUVBEB4QYmoDAAcDABAIEAMHHAIcAhAeEGJqAwAHAwEQCBADAwMcAhwHBwQBHAQHEB4QYmoDAAcGChAIRkBHVx4QYmoDAAcGCxAIRkBHVx4QYmoDAAMECxAIAB4QYmoDAwsCABAIAR4QYmoDAwcEAhAIAwALBh4QYmoDAwEBABAIAwQFCgoKBwUFBQcKBh4QYmoDAAAGChAIAQQCAh4QYmoDAwEKBxAIAwQFCgoKBwUFBQAGCx4QYmoDAAAKAhAIAwQFCgoKBwUFCgECBx4QYmoDAwYLBBAIEFMBAQUKBVcCH1EBAQAfAwNXVh9QCwVTHwZQUAVQCgAAA1BUVhAeEGJqAwAHBAYQCFxHXl4eEGJqAwAHBAcQCB8DHhBiagMDAQULEAhUU15BV09PHkkQRhAIEGJqAwMHBgUQHhBWEAhJEGJqAwAGCwAQCBBRBwIHUQMCVwAEUwNQBVMFBQYDBgEFVlALVAoACwMEUBAeEGJqAwAHBQIQCBAHAwNXVFQLBgoFUQZRAQcEAwdXUVYGUAdUBQBUAgsHAxAeEGJqAwMBBwAQCBAFAwEKBgoAAFMFV1EEVFMAV1MKAAEDAAAABFFXA1YGBxAeEGJqAwAACwAQCBBlV1B5W0YQHhBiagMDCgMDEAhpbx4QYmoDAwcEBRAIEGVXUHlbRhJlV1B1fhAeEGJqAwACAQAQCBBlV1B1fhIDHAISGn1CV1x1fhJ3YRIAHAIScVpAXV9bRS18bEB4QYmoDAwcBBBAIaRBzfHV d21bXEFGU1xRV1ZtU0BAU0tBEB4Qd2pmbVBeV1xWbV9bXF9TShAeEHdqZm1RXV5dQG1QR1RUV0BtWlNeVG1UXl1TRhAeEHdqZm1WW0FYXVtcRm1GW19XQG1DR1dASxAeEHdqZm1UXl1TRm1QXldcVhAeEHdqZm1UQFNVbVZXQkZaEB4Qd2pmbUFaU1ZXQG1GV0pGR0BXbV5dVhAeEHdqZm1GV0pGR0BXbVFdX0JAV0FBW11cbVBCRlEQHhB3am9ENZtRldKRkdAV21RXV9CQFdBQVtdXG1AVUZREB4Qd2pmbUZXSkZHQFdtVFteRldAbVNcW0FdRkBdQltREB4Qd2pmbUFgdXAQHhB5emBtQlNAU15eV15tQVpTVldAbVFdX0JbXlcQHhB9d2FtV15XX1dcRm1bXFZXSm1HW1xGEB4QfXdhbVRQXW1AV1xWV0BtX1tCX1NCEB4QfXdhbUFGU1xWU0BWbVZXQFtEU0ZbRFdBEB4QfXdhbUZXSkZHQFdtVF5dU0YQHhB9d2FtRldKRkdAV21UXl1TRm1eW1xXU0AQHhB9d2FtRldKRkdAV21aU15UbVReXVNGEB4QfXdhbUZXSkZHQFdtWlNeVG1UXl1TRm1eW1xXU0AmQHhB9d2FtRFdARldKbVNAQFNLbV1QWFdRRhAeEGV3cHV bVFdXl1AbVBHVFRXQG1UXl1TRhAeEGV3cHV bVFdX0JAV0FBV1ZtRldKRkdAV21BAUZREB4QZXdwdX5tUV1fQkBXQUFXVm1GV0pGR0BXbUEBRlFtQUBVUBAeEGV3cHV bVZXUEdVbUBXXFZXQFdAbVtcVF0QHhBld3B1fm1WV1BHVW1BWlNWV0BBEB4QZXdwdX5tVldCRlptRldKRkdAVxAeEGV3cHV bVZAU0VtUEdUVFdAQRAeEGV3cHV bV5dQVdtUV1cRldKRhAeEGV3cHV bV9HXkZbbVZAU0UQbx4QYmoDAAMGCxAIaRBpAx4SA28QHhBpAx4SAwIABm8QHgoeEEtXQRAeCh4ABh4KHgMEHgEAHgMEAQoGHgMCAAYeAwQBCgYeAwQeAwQBCgYeAQIeAwQeAwQeBgILBB4Q>aQEABQQFHhIBAAUEBW8QHhBcXW1UQhAeAAEeAwAFHgMABR4AAR4DAAUeAwAFHgABHgMABR4DAAUeAAEeAwAFHgMABR4AAR4DAAUeAwAFHgABHgMABR4DAAUeAAEeAwAFHgMABR4AAR4DAAUeAwAFHgABHgMABR4DAAUeAAEeAwAFHgMABR4AAR4DAAUeAwAFHgABHgMABR4DAAVvHhBiagMAAQcAEAgQdV1dVV5XEntcURwSGntcRldeGxAeEGJqAwMGBwcQCBBzfHV dxIae1xGVD^14eEntcRldeGmAbEntAW0EaYBsSalcSdUBTQlpbUUESdltAV1FGAXYDAxJEQW0HbQISQkFtB20CHhJ2AXYDAxsQHhBiagMDBwEGEAgQZVdQdX4SdX5hfhJ3YRIDHAISGn1CV1x1fhJ3YRJ1fmF EndhEgMcAhJxWkBdX1tHXxsQHhBiagMABwIBEAgQAgQLVFYEUQEFAQRXC1FXCgNTUwpXClEAAgZUVwILAVYQHhBiagMABwIAEAgQVlNQCgNRUAYBClcLUANXUVYLAwcDUwFQUwEBUwoAUAoQHhBiagMDCwAFEAgQB1ZTBQRQAFZRUQsGUVABAgVQU1QEU1RQVlEEU1ZTBgMQHhBiagMABwUAEAgQVwMLBAQAVgRTVldWAgsKAwdRAAEHBlADAgsLVlAKCgQQHhBiagMDBgUFEAgQAwAEHAoECwUABgEKCwYKBwUKEB4QYmoDAAMCCxAIEABWUVcKUQcHUQQKCwUCBAVUVlQCUQUEVlZUBFcEVgcCEB4QYmoDAAYLAxAIEAUHAAFQVARXB1ZRU1ZRVFRWU1cEUAECBAEKAAVXAQYHEB4QYmoDAAMBAhAIaRBtbVxAbUBXQ0dbQFcQHhBtbUJXQFQQHhBtbX59c3ZzcH53bX59c3Z3dm1xemd8eWFtbRAeEEFtW21UXltCWVNARh9CQFYQbx4QYmoDAwEKBBAIaRBFV1BWQFtEV0AQbx4QYmoDAAcABxAIEApUBFYBBFRUAgBXUwAHAAYBVAVWUAQLVANQAAABBVBTEB4QYmoDAAcABBAIEFYGA1YKUVYLClQCAlAAAgZXCwoCAgsLCldRVAoGAAVXEB4QYmoDAwsGChAIAxwHHhBiagMDBAoHEAgKHhBiagMDCwoEEAhGQEdXHhBiagMAAAsLEAhGQEdXHhBiagMAAQEDEAhGQEdXHhBiagMDAQMEEAhUU15BVx4QYmoDAwYGChAIRkBHVx4QYmoDAAMLBBAIEF9bQUFbXFUQHhBiagMABgAFEAhpEG1tXEBtQFdDR1tAVi9xAeEG1tQldAVBAeEG1CSnNCQntWEB4QbW1 fXN2c3B d21 fXN2d3ZtcXpnfHlhbW0QHhBtVXxGZl5bAXNaU1xWXldAEG8eEGJqAwMKBgAQCGlvHhBiagMABgELEAhpEGJ2dBJkW1dFV0AICGJdQEZTUF5XEnZdUUdfV1xGEnRdQF9TRggIU0JCXltRU0ZbXVwdQlZUTEJWVAgIRldKRh1CVlRMQlZUEB4QcVpAXV9XEmJ2dBJkW1dFV0AICGJdQEZTUF5XEnZdUUdfV1xGEnRdQF9TRggIU0JCXltRU0ZbXVwdQlZUTEJWVAgIRldKRh1CVlRMQlZUEB4QcVpAXV9bR18SYnZ0EmRbV0VXQAgIYl1ARlNQXlcSdl1RR19XXEYSdF1AX1NGCAhTQkJeW1FTRltdXB1CVlRMQlZUCAhGV0pGHUJWVExCVlQQHhB/W1FAXUFdVEYSd1ZVVxJidEnQSZFtXRVdACAhiXUBGU1BeVxJ2XVFHX1dcRhJ0XUBfU0YICFNCQl5bUVNGW11cHUJWVExCVlQICEZXSkYdQlZUTEJWVBAeEGVXUHlbRhJQR1teRh9bXBJidnQICGJdQEZTUF5XEnZdUUdfV1xGEnRdQF9TRggIU0JCXltRU0ZbXVwdQlZUTEJWVAgIRldKRh1CVlRMQlZUEG8eEGJqAwMLCwEQCBADBAUKCgoHBQQKAQAHEB4QYmoDAAAAChAIEGZLQld3QEBdQAgScVNcXF1GEkBXU1YSQkBdQldARltXQRJdVBJcR15eEhpAV1NWW1xVEhUCFRsSU0YSQVcSGlpGRkJBCB0dQUZTRltRH1NBQVdGQR9FV1AcVF5bSlFTQEYcUV1fHUJKHVV8RmZeWwFzHVtcW0YcWEEIAAgDCwMFChsSU0YSVEdcURIaWkZGQkEIHR1BRlNGW1EfU0FBV0ZBH0VXUBxUXltKUVNARhxRXV8dQkodVXxGZl5bAXMdW1xbRhxYQQgACAMBBAsKAxsSU0YSe1cSGlpGRkJBCB0dQUZTRltRH1NBQVdGQR9FV1AcVF5bSlFTQEYcUV1fHUJKHVV8RmZeWwFzHVtcW0YcWEEIAAgAAAsAARsSU0YSWkZGQkEIHR1BRlNGW1EfU0FBV0ZBH0VXUBxUXltKUVNARhxRXV8dQkodVXxGZl5bAXMdW1xbRhxYQQgACAMBCgcKABJTRhJaRkZCQQgdHUFGU0ZbUR9TQUFXRkEfRVdQHFReW0pRU0BGHFFdXx1CSh1VfEZmXlsBcx1bXFtGHFhBCAEIAwcHAAISU0YSXEBlQFNCQldAEhpaRkZCQQgdHUVFRRxUXltCWVNARhxRXV8dCAMHCAALBwMHGxAeEGJqAwAACgoQCEZAR1ceEGJqAwAGBgQQCAEBHhBiagMAAAEENEAgQVFYFAwYLUFBUUAEDBAQLC1dUCwMKVFMFUFAFBwMCUwoQHhBiagMDAQILEAgQVgYDVgpRVgsKVAICUAACBlcLCgICCwsKV1FUCgYABVcQHhBiagMDBwcDEAgQVFYFAwYLUFBUUAEDBAQLC1dUCwMKVFMFUFAFBwMCUwoQHhBiagMDBgoGEAhpbx4QYmoDAwoGARAIAwAKAh4QYmoDAwUKAxAIBQACHhBiagMAAwADEAgDAAoCHhBiagMAAQoFEAgQAwAKAmoFAAIQHhBiagMDAK?G[QoCEAgABh4QYmoDAAICARAIAAYeEGJqAwADAAoQCAQFAB4QYmoDAwoGCxAIEAMCAAIFUABUEB4QYmoDAwcKARAIEFdcH2dhEB4QYmoDAAYHChAIEGVbXAEAEB4QYmoDAwUHBhAIEH9dSFteXlMdBxwCEhplW1xWXUVBEnxmEgMCHAIJEmVbXAQGC7RJKBAYbEnNCQl5XZVdQeVtGHQcBBRwBBBIaeXpmf34eEl5bWVcSdVdRWV0bEnFaQF1fVx0DAwMcAhwCHAISYVNUU0BbHQcBBRwBBBAeEGJqAwMECgMQCGkQV1wfZ2EQHhBXXBBvHhBiagMAAgEFEAhGQEdXHhBiagMDBAADEAgKHhBiagMDAQsCEAgfAQECHhBiagMDBAUKEAhUU15BVx4QYmoDAwoGAhAIEGVXVhJ/U0ASAwcSAAIAARIDCggBCwgABRJ1f2YZAgcBAhIae1xWW1MSYUZTXFZTQFYSZltfVxsQHhBiagMDBwYCEAhGQEdXHhBiagMDBwELEAgQBAYHBwRRBQUQHhBiagMDBwcHEAgAAwUABAYLBgUAHhBiagMDBgcAEAgQBgIEBVEDAFYQHhBiagMABwAFEAgQUVMCVlEABlFUVAcBVFNUAAEEVlYCAlYHAAsHBwJUBwUQHhBiagMABwIDEAgQBlZWVlECAAMFBQBQVFEKBAIFVwNTB1MKV1cKBFQCUAsQHhBiagMDCwIAEAgGHhBiagMDBwQCEAgDBwIBHhBiagMAAAoCEAgDBAUKCgoHBQUKAQIHHhBiagMDBgsEEAgQUwEBBQoFVwIfUQEBAB8DA1dWH1ALBVMfBlBQBVAKAAADUFRWEB4QYmoDAAcEBhAIXEdeXh4QYmoDAAcEBxAIHwMeEGJqAwMBBQsQCFRTXkFXT08eSRBGEAgQYmoDAAMAARAeEFYQCEkQYmoDAAMCChAIAwEKHhBiagMABgMGEAgABAceEGJqAwMLCgYQCBBmS0JXd0BAXUAIEnFTXFxdRhJAV1NWEkJAXUJXQEZbV0ESXVQSXEdeXhIaQFdTVltcVRIVAhUbblwSEhISU0YSQVcSGlpGRkJBCB0dQUZTRltRH1NBQVdGQR9FV1AcVF5bSlFTQEYcUV1fHUJKHVV8RmZeWwFzHVtcW0YcWEEIAAgDCwMFChtuXBISEhJTRhJ6Zn9 cF1WS3deV19XXEYcFlsSGlpGRkJBCB0dQUZTRltRH1NBQVdGQR9FV1AcVF5bSlFTQEYcUV1fHUJKHVV8RmZeWwFzHVtcW0YcWEEIAAgKBAEKARtuXBISEhJTRhJ6Zn9 7cF1WS3deV19XXEYcDlNcXVxLX11HQQwSGlpGRkJBCB0dQUZTRltRH1NBQVdGQR9FV1AcVF5bSlFTQEYcUV1fHUJKHVV8RmZeWwFzHVtcW0YcWEEIAQgDBwcAAhtuXBISEhJTRhJ6Zn9 cF1WS3deV19XXEYcXEBlQFNCQldAEhpaRkZCQQgdHUVFRRxUXltCWVNARhxRXV8dCAMHCAALBwMHGxAeEGJqAwABAgEQCBBfXUdBV19dRFcQHhBiagMDBAsLEAgEAgEeEGJqAwMLCgUQCBBGQEdXEB4QYmoDAAYEAxAIRkBHVx4QYmoDAwQHABAIEHZ7ZAhcRlofUVpbXlYaABsMdntkCFxGWh9RWlteVhoDGwxzDHZ7ZAx7f3UIXEZaH1FaW15WGgAbEB4QYmoDAwsCABAIBx4QYmoDAwcEAhAIAwcDAh4QYmoDAAAKAhAIAwQFCgoKBwUFCgECBx4QYmoDAwYLBBAIEFMBAQUKBVcCH1EBAQAfAwNXVh9QCwVTHwZQUAVQCgAAA1BUVhAeEGJqAwAHBAYQCFxHXl4eEGJqAwAHBAcQCB8DHhBiagMDAQULEAhUU15BV09Pbw==")
            .formParam("appId", "PXgNtTli3A")
            .formParam("tag", "v8.2.9-HF")
            .formParam("uuid", "a33787e0-c332-11ed-b97a-4bb7b8221bfd")
            .formParam("ft", "297")
            .formParam("seq", "1")
            .formParam("en", "NTA")
            .formParam("cs", "3eeb99103b775d691c234a649d440bf92a6259458d9205f2b99462d3ca63d0a7")
            .formParam("pc", "9538108411191091")
            .formParam("sid", "9356b052-c332-11ed-89e4-6c6249477044󠄱󠄶󠄷󠄸󠄸󠄸󠄵󠄷󠄷󠄸󠄰󠄹󠄱")
            .formParam("vid", "9356a6c7-c332-11ed-89e4-6c6249477044")
            .formParam("cts", "9356b4ef-c332-11ed-89e4-6c6249477044")
            .formParam("rsc", "2"),
          http("request_37")
            .post(uri07)
            .headers(headers_33)
            .formParam("payload", "aUkQRhAIEGJqAwAGAgYQHhBWEAhJEGJqAwMECgIQCBBTAQEFCgVXAh9RAQEAHwMDV1YfUAsFUx8GUFAFUAoAAANQVFYQHhBiagMDAQELEAgDBAoeEGJqAwMLAQcQCBBUU0FGXksQHhBUU0FGXkttVlNGU1FXXEZXQBAIEH9zcxAeEGJqAwMLAgAQCAQeGEG^JqAwMHBAIQCAAHAgUeEGJqAwAACgIQCAMSEBQoKCgcF9ENBQsABwceEGmJqAwMGCwQQCBBTAQ>EFCgVXAh9D^RAQEAHwMDV1YfUAsFUx8GUFAFUAoAAANQVi9FYQHhBiagMABwQGEEAhcR15eHhBiagMABwQHEAgfAx4QYmoDNAwEFCxAIVK?G[FNe7QVceEGJqAwMEBgcQCBBaRkZCQQgdHUVFRRxUXlt7CWVNARhxRXV8dEE9Pbw==")
            .formParam("appId", "PXgNtTli3A")
            .formParam("tag", "v8.2.9-HF")
            .formParam("uuid", "a33787e0-c332-11ed-b97a-4bb7b8221bfd")
            .formParam("ft", "297")
            .formParam("seq", "2")
            .formParam("en", "NTA")
            .formParam("cs", "3eeb99103b775d691c234a649d440bf92a6259458d9205f2b99462d3ca63d0a7")
            .formParam("pc", "5192911942600200")
            .formParam("sid", "9356b052-c332-11ed-89e4-6c6249477044󠄱󠄶󠄷󠄸󠄸󠄸󠄵󠄷󠄷󠄸󠄰󠄹󠄱")
            .formParam("vid", "9356a6c7-c332-11ed-89e4-6c6249477044")
            .formParam("cts", "9356b4ef-c332-11ed-89e4-6c6249477044")
            .formParam("rsc", "3")
        )
    )
    .pause(3)
    .exec(
      http("request_38")
        .get(uri01 + "/fk-p-flap/3376/560/image/d0eaf46130be23e4.jpg?q=50")
    )
    .pause(1)
    .exec(
      http("request_39")
        .post(uri10 + "/events/1/NRJS-dd5f16cdf95712c6cba?a=1588759528&sa=1&v=1216.487a282&t=Unnamed%20Transaction&rst=7344&ck=1&ref=https://www.flipkart.com/")
        .headers(headers_39)
        .body(RawFileBody("computerdatabase/recordedsimulation/0039_request.gif"))
    )
    .pause(1)
    .exec(
      http("request_40")
        .post(uri11 + "/1/fdp")
        .headers(headers_29)
        .body(RawFileBody("computerdatabase/recordedsimulation/0040_request.json"))
        .resources(
          http("request_41")
            .options(uri11 + "/4/page/fetch")
            .headers(headers_41),
          http("request_42")
            .post(uri11 + "/4/page/fetch")
            .headers(headers_29)
            .body(RawFileBody("computerdatabase/recordedsimulation/0042_request.json"))
            .check(status().is(406)),
          http("request_43")
            .options("/api/4/page/fetch")
            .headers(headers_41),
          http("request_44")
            .post(uri10 + "/events/1/NRJS-dd5f16cdf95712c6cba?a=1588759528&sa=1&v=1216.487a282&t=Unnamed%20Transaction&rst=9258&ck=1&ref=https://www.flipkart.com/big-saving-days-jan-sale-store")
            .headers(headers_39)
            .body(RawFileBody("computerdatabase/recordedsimulation/0044_request.gif")),
          http("request_45")
            .post("/api/4/page/fetch")
            .headers(headers_29)
            .body(RawFileBody("computerdatabase/recordedsimulation/0045_request.json")),
          http("request_46")
            .get(uri01 + "/fk-p-flap/100/100/image/b53c59fac5c6789c.jpg?q=50")
            .headers(headers_46),
          http("request_47")
            .post(uri05 + "/s25535848778834")
            .headers(headers_32)
            .body(RawFileBody("computerdatabase/recordedsimulation/0047_request.gif")),
          http("request_48")
            .get(uri01 + "/fk-p-flap/50/50/image/1c808f9e609ff508.jpg?q=50")
            .headers(headers_46),
          http("request_49")
            .get(uri01 + "/fk-p-flap/50/50/image/186a15f8bda76c5e.jpeg?q=50")
            .headers(headers_46),
          http("request_50")
            .get(uri01 + "/fk-p-flap/50/50/image/a45cedf67f39f5fb.jpeg?q=50")
            .headers(headers_46),
          http("request_51")
            .get(uri01 + "/fk-p-flap/50/50/image/f6b533f6a881c61b.jpg?q=50")
            .headers(headers_46),
          http("request_52")
            .get(uri01 + "/fk-p-flap/50/50/image/99a4f202cae72c2f.jpg?q=50")
            .headers(headers_46),
          http("request_53")
            .get(uri01 + "/fk-p-flap/50/50/image/6be9582a83e47931.jpeg?q=50")
            .headers(headers_46),
          http("request_54")
            .get(uri01 + "/fk-p-flap/50/50/image/3e138da403729d13.jpeg?q=50")
            .headers(headers_46),
          http("request_55")
            .get(uri01 + "/fk-p-flap/50/50/image/e3176472c399161e.jpg?q=50")
            .headers(headers_46),
          http("request_56")
            .get(uri01 + "/fk-p-flap/50/50/image/254ae85cfd35a5de.jpeg?q=50")
            .headers(headers_46),
          http("request_57")
            .get(uri01 + "/fk-p-flap/100/100/image/f665958e8666bc77.jpg?q=50")
            .headers(headers_46),
          http("request_58")
            .get(uri01 + "/fk-p-flap/100/100/image/350d555b66fed4d1.jpg?q=50")
            .headers(headers_46),
          http("request_59")
            .get(uri01 + "/fk-p-flap/50/50/image/7d07367612ff1a2f.jpeg?q=50")
            .headers(headers_46),
          http("request_60")
            .get(uri01 + "/fk-p-flap/50/50/image/594f2a22f88b459c.jpg?q=50")
            .headers(headers_46),
          http("request_61")
            .get(uri01 + "/fk-p-flap/50/50/image/43e9a35fed86f669.jpeg?q=50")
            .headers(headers_46),
          http("request_62")
            .get(uri01 + "/fk-p-flap/50/50/image/96bd00262a6937e6.jpg?q=50")
            .headers(headers_15),
          http("request_63")
            .get(uri01 + "/fk-p-flap/100/100/image/2ec749300a798d85.jpg?q=50")
            .headers(headers_46),
          http("request_64")
            .get(uri01 + "/fk-p-flap/100/100/image/0201a1b5025ddb98.jpg?q=50")
            .headers(headers_46),
          http("request_65")
            .get(uri01 + "/fk-p-flap/50/50/image/41e3a0cc649825a5.jpg?q=50")
            .headers(headers_46),
          http("request_66")
            .get(uri01 + "/fk-p-flap/50/50/image/8a6363d51678c834.jpg?q=50")
            .headers(headers_46),
          http("request_67")
            .get(uri01 + "/fk-p-flap/50/50/image/82c7daf7e842f969.jpg?q=50")
            .headers(headers_46),
          http("request_68")
            .get(uri01 + "/fk-p-flap/50/50/image/78f532078ecf4188.jpg?q=50")
            .headers(headers_46),
          http("request_69")
            .get(uri01 + "/fk-p-flap/50/50/image/3f69bd2ae7499b34.jpg?q=50")
            .headers(headers_46),
          http("request_70")
            .get(uri01 + "/fk-p-flap/50/50/image/b25887a177c499cc.jpg?q=50")
            .headers(headers_46),
          http("request_71")
            .get(uri01 + "/fk-p-flap/50/50/image/6072857d2ee8f7df.jpg?q=50")
            .headers(headers_46),
          http("request_72")
            .get(uri01 + "/fk-p-flap/50/50/image/62523e03ea9e968b.jpeg?q=50")
            .headers(headers_46),
          http("request_73")
            .get(uri01 + "/fk-p-flap/50/50/image/7004c4228b6b3803.jpeg?q=50")
            .headers(headers_46),
          http("request_74")
            .get(uri01 + "/fk-p-flap/50/50/image/a8b6f74c8c3885e2.jpeg?q=50")
            .headers(headers_46),
          http("request_75")
            .get(uri01 + "/fk-p-flap/50/50/image/48bfa84045179061.jpg?q=50")
            .headers(headers_46),
          http("request_76")
            .get(uri01 + "/fk-p-flap/50/50/image/3d407da2ef05b2c4.jpeg?q=50")
            .headers(headers_46),
          http("request_77")
            .get(uri01 + "/fk-p-flap/50/50/image/cf2979ab8916bd8a.jpeg?q=50")
            .headers(headers_46),
          http("request_78")
            .get(uri01 + "/fk-p-flap/50/50/image/e3086084c7a4879b.jpeg?q=50")
            .headers(headers_46),
          http("request_79")
            .get(uri01 + "/fk-p-flap/50/50/image/b943f544fea6dce3.jpg?q=50")
            .headers(headers_46),
          http("request_80")
            .get(uri01 + "/fk-p-flap/50/50/image/b22ccb371c890197.jpeg?q=50")
            .headers(headers_46),
          http("request_81")
            .get(uri01 + "/fk-p-flap/50/50/image/88b3852398b4c6e8.jpeg?q=50")
            .headers(headers_46),
          http("request_82")
            .get(uri01 + "/fk-p-flap/50/50/image/c528afe37e75796e.jpg?q=50")
            .headers(headers_46),
          http("request_83")
            .get(uri01 + "/fk-p-flap/50/50/image/5ab0aeeda7cb3103.jpg?q=50")
            .headers(headers_46),
          http("request_84")
            .get(uri01 + "/fk-p-flap/50/50/image/bdb5aba3b208f6e7.jpeg?q=50")
            .headers(headers_46),
          http("request_85")
            .get(uri01 + "/fk-p-flap/50/50/image/f26891cf86018265.jpeg?q=50")
            .headers(headers_46),
          http("request_86")
            .get(uri01 + "/fk-p-flap/50/50/image/d74a5ffcb938660c.jpeg?q=50")
            .headers(headers_46),
          http("request_87")
            .get(uri01 + "/fk-p-flap/50/50/image/6c1413c0a5df0e8f.jpg?q=50")
            .headers(headers_46),
          http("request_88")
            .get(uri01 + "/fk-p-flap/3600/3600/image/96bd00262a6937e6.jpg?q=80")
            .headers(headers_46),
          http("request_89")
            .get(uri01 + "/fk-p-flap/50/50/image/eb55854cbc49c5ab.jpg?q=50")
            .headers(headers_46),
          http("request_90")
            .get(uri01 + "/fk-p-flap/50/50/image/187812547d6548d0.jpeg?q=50")
            .headers(headers_46),
          http("request_91")
            .get(uri01 + "/fk-p-flap/50/50/image/3a5b8cf1313fb35c.jpeg?q=50")
            .headers(headers_46),
          http("request_92")
            .get(uri01 + "/fk-p-flap/50/50/image/ced006a8864c3a5b.jpeg?q=50")
            .headers(headers_46),
          http("request_93")
            .get(uri01 + "/fk-p-flap/50/50/image/6579ab417cad6fd9.jpeg?q=50")
            .headers(headers_46),
          http("request_94")
            .get(uri01 + "/fk-p-flap/50/50/image/e64e335b07b6fa3c.jpeg?q=50")
            .headers(headers_46),
          http("request_95")
            .get(uri01 + "/fk-p-flap/50/50/image/84859540ad324181.jpeg?q=50")
            .headers(headers_46),
          http("request_96")
            .get(uri01 + "/fk-p-flap/2000/2000/image/b53c59fac5c6789c.jpg?q=50")
            .headers(headers_46),
          http("request_97")
            .get(uri01 + "/fk-p-flap/2000/2000/image/2ec749300a798d85.jpg?q=50")
            .headers(headers_46),
          http("request_98")
            .get(uri01 + "/fk-p-flap/100/100/image/30759b173fb796e6.jpg?q=50")
            .headers(headers_46),
          http("request_99")
            .get(uri01 + "/fk-p-flap/100/100/image/692a518d6d94ba9e.jpg?q=50")
            .headers(headers_46),
          http("request_100")
            .get(uri01 + "/fk-p-flap/100/100/image/e2b75ed5720de0e9.jpg?q=50")
            .headers(headers_46),
          http("request_101")
            .get(uri01 + "/fk-p-flap/100/100/image/747742e4935a4ebb.jpg?q=50")
            .headers(headers_46),
          http("request_102")
            .get(uri01 + "/fk-p-flap/100/100/image/d764b23ce57014fe.jpg?q=50")
            .headers(headers_46),
          http("request_103")
            .get(uri01 + "/fk-p-flap/100/100/image/6ab494aa31b781f6.jpg?q=50")
            .headers(headers_46),
          http("request_104")
            .get(uri01 + "/fk-p-flap/100/100/image/ef05de7b49de5ba6.jpg?q=50")
            .headers(headers_46),
          http("request_105")
            .get(uri01 + "/fk-p-flap/100/100/image/0163a9400042dd58.jpg?q=50")
            .headers(headers_46),
          http("request_106")
            .get(uri01 + "/fk-p-flap/100/100/image/d6ed9df8f4f42401.jpg?q=50")
            .headers(headers_46),
          http("request_107")
            .get(uri01 + "/fk-p-flap/100/100/image/93fae4e0f7d0fbf2.jpg?q=50")
            .headers(headers_46),
          http("request_108")
            .get(uri01 + "/fk-p-flap/100/100/image/54b6b8e21c635610.jpg?q=50")
            .headers(headers_46),
          http("request_109")
            .get(uri01 + "/fk-p-flap/100/100/image/1edd32350713368b.jpg?q=50")
            .headers(headers_46),
          http("request_110")
            .get(uri01 + "/fk-p-flap/100/100/image/d2116d20c064a73f.jpg?q=50")
            .headers(headers_46),
          http("request_111")
            .get(uri01 + "/fk-p-flap/100/100/image/a4e33db48eb70bc4.jpg?q=50")
            .headers(headers_46),
          http("request_112")
            .get(uri01 + "/fk-p-flap/100/100/image/fa04a6a4d29d7b5a.jpg?q=50")
            .headers(headers_46),
          http("request_113")
            .get(uri01 + "/fk-p-flap/100/100/image/17cdc7a7a1dd1738.jpg?q=50")
            .headers(headers_46),
          http("request_114")
            .get(uri01 + "/fk-p-flap/960/960/image/186a15f8bda76c5e.jpeg?q=50")
            .headers(headers_46),
          http("request_115")
            .get(uri01 + "/fk-p-flap/960/960/image/1c808f9e609ff508.jpg?q=50")
            .headers(headers_46),
          http("request_116")
            .get(uri01 + "/fk-p-flap/960/960/image/a45cedf67f39f5fb.jpeg?q=50")
            .headers(headers_46),
          http("request_117")
            .get(uri01 + "/fk-p-flap/960/960/image/3e138da403729d13.jpeg?q=50")
            .headers(headers_46),
          http("request_118")
            .get(uri01 + "/fk-p-flap/960/960/image/f6b533f6a881c61b.jpg?q=50")
            .headers(headers_46),
          http("request_119")
            .get(uri01 + "/fk-p-flap/960/960/image/99a4f202cae72c2f.jpg?q=50")
            .headers(headers_46),
          http("request_120")
            .get(uri01 + "/fk-p-flap/960/960/image/6be9582a83e47931.jpeg?q=50")
            .headers(headers_46),
          http("request_121")
            .get(uri01 + "/fk-p-flap/960/960/image/254ae85cfd35a5de.jpeg?q=50")
            .headers(headers_46),
          http("request_122")
            .get(uri01 + "/fk-p-flap/960/960/image/e3176472c399161e.jpg?q=50")
            .headers(headers_46),
          http("request_123")
            .get(uri01 + "/fk-p-flap/2000/2000/image/f665958e8666bc77.jpg?q=50")
            .headers(headers_46),
          http("request_124")
            .post(uri10 + "/events/1/NRJS-dd5f16cdf95712c6cba?a=1588759528&sa=1&v=1216.487a282&t=Unnamed%20Transaction&rst=11302&ck=1&ref=https://www.flipkart.com/big-saving-days-jan-sale-store")
            .headers(headers_39)
            .body(RawFileBody("computerdatabase/recordedsimulation/0124_request.gif")),
          http("request_125")
            .get(uri01 + "/fk-p-flap/400/400/image/0163a9400042dd58.jpg?q=50")
            .headers(headers_46),
          http("request_126")
            .get(uri01 + "/fk-p-flap/400/400/image/e2b75ed5720de0e9.jpg?q=50")
            .headers(headers_46),
          http("request_127")
            .get(uri01 + "/fk-p-flap/400/400/image/692a518d6d94ba9e.jpg?q=50")
            .headers(headers_46),
          http("request_128")
            .get(uri01 + "/fk-p-flap/400/400/image/30759b173fb796e6.jpg?q=50")
            .headers(headers_46),
          http("request_129")
            .get(uri01 + "/fk-p-flap/400/400/image/d6ed9df8f4f42401.jpg?q=50")
            .headers(headers_46),
          http("request_130")
            .get(uri01 + "/fk-p-flap/400/400/image/747742e4935a4ebb.jpg?q=50")
            .headers(headers_46),
          http("request_131")
            .get(uri01 + "/fk-p-flap/400/400/image/ef05de7b49de5ba6.jpg?q=50")
            .headers(headers_46),
          http("request_132")
            .get(uri01 + "/fk-p-flap/400/400/image/d764b23ce57014fe.jpg?q=50")
            .headers(headers_46),
          http("request_133")
            .get(uri01 + "/fk-p-flap/400/400/image/a4e33db48eb70bc4.jpg?q=50")
            .headers(headers_46),
          http("request_134")
            .get(uri01 + "/fk-p-flap/400/400/image/d2116d20c064a73f.jpg?q=50")
            .headers(headers_46),
          http("request_135")
            .get(uri01 + "/fk-p-flap/400/400/image/6ab494aa31b781f6.jpg?q=50")
            .headers(headers_46),
          http("request_136")
            .get(uri01 + "/fk-p-flap/400/400/image/1edd32350713368b.jpg?q=50")
            .headers(headers_46),
          http("request_137")
            .get(uri01 + "/fk-p-flap/400/400/image/fa04a6a4d29d7b5a.jpg?q=50")
            .headers(headers_46),
          http("request_138")
            .get(uri01 + "/fk-p-flap/400/400/image/17cdc7a7a1dd1738.jpg?q=50")
            .headers(headers_46),
          http("request_139")
            .get(uri01 + "/fk-p-flap/400/400/image/54b6b8e21c635610.jpg?q=50")
            .headers(headers_46),
          http("request_140")
            .get(uri01 + "/fk-p-flap/400/400/image/93fae4e0f7d0fbf2.jpg?q=50")
            .headers(headers_46),
          http("request_141")
            .get(uri01 + "/fk-p-flap/2000/2000/image/350d555b66fed4d1.jpg?q=50")
            .headers(headers_46)
        )
    )
    .pause(3)
    .exec(
      http("request_142")
        .post("/api/1/fdp")
        .headers(headers_29)
        .body(RawFileBody("computerdatabase/recordedsimulation/0142_request.json"))
        .resources(
          http("request_143")
            .post("/api/4/page/fetch")
            .headers(headers_29)
            .body(RawFileBody("computerdatabase/recordedsimulation/0143_request.json")),
          http("request_144")
            .post(uri05 + "/s25413350678990")
            .headers(headers_32)
            .body(RawFileBody("computerdatabase/recordedsimulation/0144_request.gif")),
          http("request_145")
            .get(uri01 + "/image/400/400/xif0q/smartwatch/z/5/r/-original-imagk7wrscz7ttwt.jpeg?q=70")
            .headers(headers_15),
          http("request_146")
            .get(uri01 + "/image/400/400/xif0q/smartwatch/b/e/e/-original-imagkjtjgdzhgdz5.jpeg?q=70")
            .headers(headers_15),
          http("request_147")
            .get(uri01 + "/image/400/400/xif0q/smartwatch/h/x/z/1-83-bsw026-android-ios-fire-boltt-no-original-imagg6kh4mn6szrp.jpeg?q=70")
            .headers(headers_15),
          http("request_148")
            .get(uri01 + "/image/400/400/xif0q/smartwatch/f/l/0/-original-imagknhxgpx2naac.jpeg?q=70")
            .headers(headers_15),
          http("request_149")
            .get(uri01 + "/image/400/400/xif0q/smartwatch/i/b/9/-original-imagm2e42k9fff9w.jpeg?q=70")
            .headers(headers_15),
          http("request_150")
            .get(uri01 + "/image/400/400/xif0q/smartwatch/v/f/e/34-79-glow-android-ios-gizmore-yes-original-imaghprpwsfgegae.jpeg?q=70")
            .headers(headers_15),
          http("request_151")
            .get(uri01 + "/image/400/400/xif0q/smartwatch/d/u/f/-original-imaghbgakwcqed9h.jpeg?q=70")
            .headers(headers_15),
          http("request_152")
            .get(uri01 + "/image/400/400/xif0q/smartwatch/o/z/g/-original-imagjuh8sh6dgkku.jpeg?q=70")
            .headers(headers_15),
          http("request_153")
            .get(uri01 + "/image/400/400/xif0q/smartwatch/v/9/a/1-39-90156ap04-android-ios-titan-yes-original-imagjt4cxeuzdazz.jpeg?q=70")
            .headers(headers_15),
          http("request_154")
            .get(uri01 + "/image/400/400/xif0q/smartwatch/t/e/t/-original-imagk9v4er2vm89p.jpeg?q=70")
            .headers(headers_15),
          http("request_155")
            .get(uri01 + "/image/400/400/l4d2ljk0/smartwatch/k/n/m/-original-imagfa2z9urwbhrg.jpeg?q=70")
            .headers(headers_15),
          http("request_156")
            .post(uri10 + "/events/1/NRJS-dd5f16cdf95712c6cba?a=1588759528&sa=1&v=1216.487a282&t=Unnamed%20Transaction&rst=16304&ck=1&ref=https://www.flipkart.com/offers-list/content")
            .headers(headers_39)
            .body(RawFileBody("computerdatabase/recordedsimulation/0156_request.gif")),
          http("request_157")
            .post(uri07)
            .headers(headers_33)
            .formParam("payload", "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^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^gMDBAcAEAgDBR4QYmoDAwoABhAIAQIEHhBiagMDBAEDEAgDAAceEGJqAwADBAcQCBBbX1UQHhBiagMAAwIKEAgGBQQeEGJqAwAGAwYQCAMECgAeEGJqAwMECwsQCAMHAgQDTx5JEGJqAwABBgEQCBBUXVFHQRAeEGJqAwAABQIQCBBGQEdXEB4QYmoDAwYABRAIAAQcBQALAwQFCwEKAAEABgAAHhBiagMAAAIKEAgBAAMcCgEBAQYBBwIHCgcLBh4QYmoDAwQHABAIAwoeEGJqAwMKAAYQCAECBB4QYmoDAwQBAxAIAwAHHhBiagMAAwQHEAgQUxAeEGJqAwMECwsQCAMHAgQBTx5JEGJqAwABBgEQCBBfXUdBV0dCEB4QYmoDAAAFAhAIEEZAR1cQHhBiagMDBgAFEAgABBwFAAsDBAULAQoAAQAGAAAeEGJqAwAAAgoQCAEAAxwKAQEBBgEHAgcKBwsGHhBiagMDBAcAEAgDCh4QYmoDAwoABhAIAQIEHhBiagMDBAEDEAgDAAceEGJqAwADBAcQCBBbX1UQHhBiagMAAwIKEAgGBQQeEGJqAwAGAwYQCAMECgAeEGJqAwMECwsQCAMHAAYATx5JEGJqAwABBgEQCBBRXltRWRAeEGJqAwAABQIQCBBGQEdXEB4QYmoDAwYABRAIAAQcBQALAwQFCwEKAAEABgAAHhBiagMAAAIKEAgBAAMcCgEBAQYBBwIHCgcLBh4QYmoDAwQHABAIAwoeEGJqAwMKAAYQCAECBB4QYmoDAwQBAxAIAwAHHhBiagMAAwQHEAgQW19VEB4QYmoDAAMCChAIBgUEHhBiagMABgMGEAgDBAoAHhBiagMAAgAHEAgQAhAeEGJqAwAGBAMQCEZAR1ceEGJqAwMECwsQCAMHAAYHTx5JEGJqAwABBgEQCBBQXkdAEB4QYmoDAAAFAhAIEEZAR1cQHhBiagMDBgAFEAgABBwFAAsDBAULAQoAAQAGAAAeEGJqAwAAAgoQCAEAAxwKAQEBBgEHAi9gcKBwsGHhBiagMDBAcAEAgDCh4QYmoDAwoABhAIAQIEHhBiagMDBAEDEAgDAAceEGJqAwADBAcQCBBTEB4QYmoDAwQLCxAIAwcBBwJPHkkQYmoDAAEGARAIEF9dR0FXX11EVxAeEGJqAwAABQIQCBBGQEdXEB4QYmoDAAECAxAIEAYFBB4KAR4DBwQDBRBPHkkQYmoDAAEGARAIEF9dR0FXXUdGEB4QYmoDAAAFAhAIEEZAR1cQHhBiagMDBgAFEAgHBB4QYmoDAAACChAIBgMDHAUDCgUHHhBiagMDBAcAEAgDCx4QYmoDAwoABhAIAwMGHhBiagMDBAEDEAgGAh4QYmoDAAMEBxAIEEFCU1wQHhBiagMAAwIKEAgGBAQeEGJqAwAGAwYQCAsFHhBiagMDBAsLEAgDBwQEBk8eSRBiagMAAQYBEAgQX11HQVdfXURXEB4QYmoDAAAFAhAIEEEZAR1cQHhBiagMAAQIDEAgQBgQGHgsLHgMHBAUDEE8eSRBiagMAAQYBEAgQX11HQVddR0YQHhBiagMAAAUCEAgQRkBHVxAeEGJqAwMGAAUQCAsEHhBiagMAAAIKEAgCHhBiagMDBAcAEAgDCx4QYmoDAwoABhAIAwAEAR4QYmoDAwQBAxAIAwAKBh4QYmoDAAMEBxAIEFZbRBAeEGJqAwADAgoQCAYEAh4QYmoDAAYDBhAIAwIGHhBiagMDBAsLEAgDBwQLB08eSRBiagMAAQYBEAgQX11HQVdfXURXEB4QYmoDAAAFAhAIEEZAR1cQHhBiagMAAQIDEAgQBgcGHgMCCx4DBwUABk4GAQQeAwAAHgMCCk4GAAQeAwALHgMCBRBPbx4QYmoDAAMFAhAIEGJqAwACAgAQHhBiagMDCwEGEAgQWkZGQkEIHR1FRUUcVF5bQllTQEYcUV1fHRAeEGJqAwADBAIQCEkQdntkAAx2e2QDDHMMdntkDHt/dQAQCAMeEBFRXVxGU1tcV0AMdntkAwx2e2QBDHZ7ZAMQCAAeEBFRXVxGU1tcV0AMdntkAwx2e2QBEAgBHhARUV1cRlNbXFdADHZ7ZAMMdntkABAIBh4QEVFdXEZTW1xXQAx2e2QDDHZ7ZAAMdntkAwx2e2QDDHZ7ZAEQCAceEHZ7ZAEMcwx2e2QAEAgEHhB2e2QADHZ7ZAMMdntkAwx2e2QBDHMQCAUeEHZ7ZAAMdntkAwx2e2QDDHMMdntkDHt/dQAQCAoeEHZ7ZAEMdntkAwxzDHZ7ZAMMdntkDHt/dQAQCAseEHZ7ZAYMdntkAwx2e2QDDHZ7ZAx7f3UAEAgDAh4QdntkBwx2e2QDDHZ7ZAMMcwx2e2QMe391ABAIAwMeEHZ7ZAQMdntkAwx2e2QDDHMMdntkDHt/dQAQCAMAHhB2e2QFNDHZ7ZAMMdntkAwxzDHZ7ZAx7f3UAEAgDAR4QdntkCgx2e2QDDHZ7ZAMMdntkDHt/dQAQCAMGHhB2e2QLDHZ7ZAMMdntkAAxzDHZ7ZAMMdntkDHt/dQAQCAMHHhB2e2QDAgx2e2QDDHZ7ZAAMcwx2e2QDDHZ7ZAx7f3UAEAgDBB4QdntkCwx2e2QDDHZ7ZAAMcxAIAwUeEGFic3wGEAgDCh4QdntkAwx2e2QBDHZ7ZAMMdntkAwx2e2QDEAgDC08eEGJqAwMKBQcQCBBTAQEFCgVXAK?G[h9RAQEAHwMDV1YfUAsFUx8GUFAFUAoAAANQVFYQHhBiagMDCgYGEAgCHhBiagMABgQHEAhGQEdXHhBiagMDAQsBEAgQAx4AHgQCC04DHgAeBAEFTgMeAx4EBQJOAx4AHgQFBU4DHgAeBAsCTgEeAB4FAwdOAx4AHgUDCk4BHgAeBQAGTgAeAB4FA7AtOAR4AHgUBBBAeEGJqAwAGBQIQCAMEBQoKCgcFBQUABgseEGJqAwMFBgUQCGkQAxwBAQEBAQEBBQECBAsFBAEAHgIQHhAEARwBAQEBAQACBAMFBAUHCh4CEB4QAAsEHgIQHhAHAQscAQEBAQMACwoKAAoDAB4CEB4QBwsKHAQEBAQKBQIDAwUDCgoeAhBvHhBiagMDBAsKEAhpEAMBCx4ABAUeAwcDAhAeEAMGAx4ABQceAwcFABAeEAMGBh4ABQseAwcLBhAeEAMGCh4ACgEeAwQAABAeEAMHAR4ACgUeAwQBBhAeEAMHBR4ACwIeAwQGCxAeEAMEAh4ACwEeAwQEBhAeEAMEAB4ACwQeAwQKAhAeEAMEBx4ACwoeAwUCABAeEAACAh4ACwUeAAsAABAeEAACAB4ACwceAAsBChAeEAACBx4ACwEeAAsHBhAeEAACCh4ACwIeAAsFAhAeEAADAh4ACgUeAAsKBxAeEAADBh4ACgYeAQICAhAeEAADBR4ACgMeAQIDBBAeEAAAAh4ABQoeAQIBAhAeEAAAAR4ABQceAQIGBBAeEAAABB4ABQMeAQIEABAeEAABAB4ABAIeAQIFChAeEAAGAB4ABgoeAQILABAeEAAHAB4AAQUeAQMCChAeEAAHCx4AAQMeAQMACxAeEAAEBB4AAAceAQMBChAeEAAFBB4AAwUeAQMHBhBvHhBiagMDBAULEAgQAwAEAUoDBQcAEB4QYmoDAwsCABAIBR4QYmoDAwcEAhAIAwQKCwYeEGJqAwAACgIQCAMEBQoKCgcFCwEHBwIeEGJqAwMGCwQQCBBTAQEFCgVXAh9RAQEAHwMDV1YfUAsFUx8GUFAFUAoAAANQVFYQHhBiagMABwQGEAhcR15eHhBiagMABwQHEAgfAx4QYmoDAwEFCxAIVFNeQVceEGJqAwMEBgcQCBBaRkZCQQgdHUVFRRxUXlt7CWVNARhxRXV8dEE9Pbw==")
            .formParam("appId", "PXgNtTli3A")
            .formParam("tag", "v8.2.9-HF")
            .formParam("uuid", "a33787e0-c332-11ed-b97a-4bb7b8221bfd")
            .formParam("ft", "297")
            .formParam("seq", "3")
            .formParam("en", "NTA")
            .formParam("cs", "3eeb99103b775d691c234a649d440bf92a6259458d9205f2b99462d3ca63d0a7")
            .formParam("pc", "9024420248780108")
            .formParam("sid", "9356b052-c332-11ed-89e4-6c6249477044󠄱󠄶󠄷󠄸󠄸󠄸󠄵󠄷󠄷󠄸󠄰󠄹󠄱")
            .formParam("vid", "9356a6c7-c332-11ed-89e4-6c6249477044")
            .formParam("cts", "9356b4ef-c332-11ed-89e4-6c6249477044")
            .formParam("rsc", "4"),
          http("request_158")
            .get(uri01 + "/image/400/400/xif0q/smartwatch/p/h/k/-original-imagkpzdcum4wzqg.jpeg?q=70")
            .headers(headers_15)
        )
    )
    .pause(2)
    .exec(
      http("request_159")
        .post("/api/1/fdp")
        .headers(headers_29)
        .body(RawFileBody("computerdatabase/recordedsimulation/0159_request.json"))
    )
    .pause(6)
    .exec(
      http("request_160")
        .options("/api/4/discover/content/lookup")
        .headers(headers_41)
        .resources(
          http("request_161")
            .post("/api/4/discover/content/lookup")
            .headers(headers_29)
            .body(RawFileBody("computerdatabase/recordedsimulation/0161_request.json")),
          http("request_162")
            .get(uri01 + "/image/400/400/xif0q/smartwatch/h/t/9/-original-imagkpn3g4chutnt.jpeg?q=70")
            .headers(headers_15),
          http("request_163")
            .get(uri01 + "/image/400/400/l4hcx3k0/smartwatch/y/l/4/1-69-a2171-android-ios-amazfit-no-original-imagfddbyxhsy5ph.jpeg?q=70")
            .headers(headers_15),
          http("request_164")
            .get(uri01 + "/image/400/400/l4ln8nk0/smartwatch/j/k/y/45-72-wrb-sw-colorfitpro4max-std-blk-blk-android-ios-noise-yes-original-imagfgr4ygy6bj4j.jpeg?q=70")
            .headers(headers_15),
          http("request_165")
            .get(uri01 + "/image/400/400/xif0q/smartwatch/v/8/l/-original-imagkvye5yyygk9z.jpeg?q=70")
            .headers(headers_15),
          http("request_166")
            .get(uri01 + "/image/400/400/xif0q/smartwatch/w/f/r/-original-imagjfbyhfyjmghc.jpeg?q=70")
            .headers(headers_15),
          http("request_167")
            .get(uri01 + "/image/400/400/xif0q/smartwatch/g/y/1/-original-imaghy22zxhakhvj.jpeg?q=70")
            .headers(headers_15),
          http("request_168")
            .get(uri01 + "/image/400/400/xif0q/smartwatch/p/h/y/-original-imaghyhnezgmcfqw.jpeg?q=70")
            .headers(headers_15),
          http("request_169")
            .get(uri01 + "/image/400/400/l3ahpjk0/smartwatch/l/n/f/-original-imagegyh8dmdxrwh.jpeg?q=70")
            .headers(headers_15)
        )
    )
    .pause(2)
    .exec(
      http("request_170")
        .post("/api/4/discover/content/lookup")
        .headers(headers_29)
        .body(RawFileBody("computerdatabase/recordedsimulation/0170_request.json"))
        .resources(
          http("request_171")
            .get(uri01 + "/image/400/400/xif0q/smartwatch/r/l/g/-original-imagkgtjhqnzrjfu.jpeg?q=70")
            .headers(headers_15),
          http("request_172")
            .get(uri01 + "/image/400/400/l4vnbm80/smartwatch/o/3/r/-original-imagfzhrxbxbytch.jpeg?q=70")
            .headers(headers_15),
          http("request_173")
            .get(uri01 + "/image/400/400/xif0q/smartwatch/n/0/r/-original-imagmjycrwjecffn.jpeg?q=70")
            .headers(headers_15),
          http("request_174")
            .get(uri01 + "/image/400/400/xif0q/smartwatch/b/l/o/-original-imagkx4ejdnfjaxw.jpeg?q=70")
            .headers(headers_15),
          http("request_175")
            .get(uri01 + "/image/400/400/xif0q/smartwatch/x/n/q/-original-imaggxsxgz8yunfa.jpeg?q=70")
            .headers(headers_15),
          http("request_176")
            .get(uri01 + "/image/400/400/xif0q/smartwatch/3/x/a/-original-imagjug8qdw4ndwr.jpeg?q=70")
            .headers(headers_15),
          http("request_177")
            .get(uri01 + "/image/400/400/xif0q/smartwatch/z/5/8/-original-imaghkpsmm4jnsv2.jpeg?q=70")
            .headers(headers_15),
          http("request_178")
            .get(uri01 + "/image/400/400/xif0q/smartwatch/z/w/v/-original-imagjkazjfwysh8p.jpeg?q=70")
            .headers(headers_15)
        )
    )
    .pause(2)
    .exec(
      http("request_179")
        .post("/api/1/fdp")
        .headers(headers_29)
        .body(RawFileBody("computerdatabase/recordedsimulation/0179_request.json"))
        .resources(
          http("request_180")
            .post(uri10 + "/events/1/NRJS-dd5f16cdf95712c6cba?a=1588759528&sa=1&v=1216.487a282&t=Unnamed%20Transaction&rst=33000&ck=1&ref=https://www.flipkart.com/wearable-smart-devices/~cs-461emm2e84/pr")
            .headers(headers_39)
            .body(RawFileBody("computerdatabase/recordedsimulation/0180_request.gif")),
          http("request_181")
            .post("/api/4/page/fetch")
            .headers(headers_29)
            .body(RawFileBody("computerdatabase/recordedsimulation/0181_request.json")),
          http("request_182")
            .post("/api/1/fdp")
            .headers(headers_29)
            .body(RawFileBody("computerdatabase/recordedsimulation/0182_request.json")),
          http("request_183")
            .get(uri01 + "/image/612/612/xif0q/smartwatch/q/v/5/1-95-bsw074-android-ios-fire-boltt-yes-original-imagmg5byh7nffyq.jpeg?q=70")
            .headers(headers_15),
          http("request_184")
            .post(uri05 + "/s26855680326820")
            .headers(headers_32)
            .body(RawFileBody("computerdatabase/recordedsimulation/0184_request.gif")),
          http("request_185")
            .get(uri01 + "/image/612/612/xif0q/smartwatch/e/c/k/-original-imagmjycgarwtbtn.jpeg?q=70")
            .headers(headers_15),
          http("request_186")
            .get(uri02 + "?id=1469476963265313&ev=browsePage&cd%5Bpcat%5D=wearable-smart-devices&cd%5Bbrand%5D=")
            .headers(headers_46),
          http("request_187")
            .get(uri01 + "/image/612/612/xif0q/smartwatch/n/0/r/-original-imagmjycrwjecffn.jpeg?q=70")
            .headers(headers_15),
          http("request_188")
            .get(uri09 + "/?label=8whdCOP52AMQtaWd5QM&guid=ON&script=0")
            .headers(headers_188),
          http("request_189")
            .get(uri06 + "/1008984980/?value=0&label=eJWICIydxgMQlMeP4QM&guid=ON&script=0&data=pagetype%3Dbrowse%3Bpcat%3Dwearable-smart-devices%3Bbrand%3D&is_vtc=1&random=2377418868&ipr=y")
            .headers(headers_188),
          http("request_190")
            .get(uri06 + "/1017598645/?value=0&label=5BlXCLOpwQMQtaWd5QM&guid=ON&script=0&data=pagetype%3Dbrowse%3Bpcat%3Dwearable-smart-devices%3Bbrand%3D&is_vtc=1&random=4031372931&ipr=y")
            .headers(headers_188),
          http("request_191")
            .get(uri06 + "/1011966879/?guid=ON&script=0&data=ecomm_prodid%3DSMWGHSJ2CXUXBQNX%2CSMWGHSJ2JCBGVPAY%2CSMWGHSJ2TBMZYWFE%3Becomm_pagetype%3Dsearchresults%3Bpcat%3Dwearable-smart-devices%3Bbrand%3D&is_vtc=1&random=3316492969&ipr=y")
            .headers(headers_188)
        )
    )
    .pause(3)
    .exec(
      http("request_192")
        .options("/api/4/product/swatch")
        .headers(headers_41)
        .resources(
          http("request_193")
            .post("/api/4/product/swatch")
            .headers(headers_29)
            .body(RawFileBody("computerdatabase/recordedsimulation/0193_request.json")),
          http("request_194")
            .post("/api/1/fdp")
            .headers(headers_29)
            .body(RawFileBody("computerdatabase/recordedsimulation/0194_request.json")),
          http("request_195")
            .get(uri05 + "/s23706560820827?AQB=1&ndh=1&pf=1&t=15%2F2%2F2023%2018%3A40%3A14%203%20-330&mid=15138873210797913897246803573242076918&aamlh=12&ce=UTF-8&ns=flipkart&pageName=Store%20%3AWearable%20Smart%20Devices&g=https%3A%2F%2Fwww.flipkart.com%2F&cc=INR&pe=lnk_o&pev2=Successful%20Search%20First%20Product%20Clicked&pid=Store%20%3AWearable%20Smart%20Devices&pidt=1&oid=https%3A%2F%2Fwww.flipkart.com%2Ffire-boltt-stardust-1-95-largest-display-high-resolution-bt-calling-rotatin&ot=A&events=event48&c54=18&v144=1&s=1280x720&c=24&j=1.6&v=N&k=Y&bw=1280&bh=301&AQE=1")
            .headers(headers_46)
        )
    )
    .pause(2)
    .exec(
      http("request_196")
        .post("/api/1/fdp")
        .headers(headers_29)
        .body(RawFileBody("computerdatabase/recordedsimulation/0196_request.json"))
        .resources(
          http("request_197")
            .post(uri10 + "/events/1/NRJS-dd5f16cdf95712c6cba?a=1588759528&sa=1&v=1216.487a282&t=Unnamed%20Transaction&rst=41308&ck=1&ref=https://www.flipkart.com/wearable-smart-devices/~cs-461emm2e84/pr")
            .headers(headers_39)
            .body(RawFileBody("computerdatabase/recordedsimulation/0197_request.gif"))
        )
    );

  {
	  setUp(scn.injectOpen(atOnceUsers(1))).protocols(httpProtocol);
  }
}
