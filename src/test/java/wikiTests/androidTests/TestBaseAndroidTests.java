package wikiTests.androidTests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import wikiTests.drivers.BrowserstackDriverAndroid;
import wikiTests.helpers.attach.Attach;


import static com.codeborne.selenide.Selenide.*;

public class TestBaseAndroidTests {
    @BeforeAll
    static void beforeAll() {
        Configuration.browser = BrowserstackDriverAndroid.class.getName();
        Configuration.browserSize = null;
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open();
    }

    @AfterEach
    void addAttachments() {
        String sessionId = sessionId().toString();

//        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();

        closeWebDriver();

        Attach.addVideo(sessionId);
    }
}
