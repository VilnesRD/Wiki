package wikiTests.helpers.browserstackVideo;

import static io.restassured.RestAssured.given;
import static java.lang.String.format;
import static wikiTests.helpers.customApiListener.CustomApiListener.withCustomTemplates;

public class BrowserstackVideo {
    public static String getVideoUrl(String sessionId) {
        String url = format("https://api.browserstack.com/app-automate/sessions/%s.json", sessionId);

        return given()
                .log().all()
                .filter(withCustomTemplates())
                .auth().basic("dmitriyrodichev_IYQhge", "7A96nnKURki2zCVF1n9y")
                .when()
                .get(url)
                .then()
                .log().all()
                .statusCode(200)
                .extract()
                .path("automation_session.video_url");
    }
}
