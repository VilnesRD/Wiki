package wikiTests.mobileTests.androidTests;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import wikiTests.mobileTests.TestBase;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.back;

public class openSettings extends TestBase {
    @Test
    @Tag("android")
    @DisplayName("Открытие страницы настроек")
    void openSettingPage() {
        back();
        $(AppiumBy.id("org.wikipedia.alpha:id/nav_more_container")).click();
        $(AppiumBy.id("org.wikipedia.alpha:id/main_drawer_settings_container")).click();
        $(AppiumBy.className("android.widget.TextView")).shouldHave(text("Settings"));
    }
}

