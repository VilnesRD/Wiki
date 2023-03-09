package wikiTests.mobileTests.androidTests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import wikiTests.mobileTests.TestBase;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.back;
import static io.appium.java_client.AppiumBy.className;
import static io.appium.java_client.AppiumBy.id;
import static io.qameta.allure.Allure.step;

public class openArticle extends TestBase {
    @Owner("Rodichev")
    @Test
    @DisplayName("Открытие статьи")
    void openTopic() {
        back();
        step("Type search", () -> {
            $(id("org.wikipedia:id/search_container")).click();
            $(id("org.wikipedia:id/search_src_text")).setValue("BrowserStack");
        });
        step("Open topic", () ->
                $(id("org.wikipedia:id/page_list_item_title"))).click();
        step("Check topic's article", () ->
                $(className("android.widget.TextView")).shouldHave(text("BrowserStack")));
    }
}

