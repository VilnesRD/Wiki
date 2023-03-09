package wikiTests.mobileTests.androidTests;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import wikiTests.mobileTests.TestBase;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class openSettings extends TestBase {
    @Test
    @Tag("android")
    @DisplayName("Открытие страницы настроек")
    void openSettingPage() {
        $(id("org.wikipedia.alpha:id/menu_overflow_button")).click();
        $(id("org.wikipedia.alpha:id/explore_overflow_settings")).click();
        $(AppiumBy.className("android.widget.TextView")).shouldHave(text("Settings"));
    }
}

