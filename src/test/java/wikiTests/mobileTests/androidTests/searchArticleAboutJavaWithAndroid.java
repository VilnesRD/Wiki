package wikiTests.mobileTests.androidTests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import wikiTests.mobileTests.TestBase;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;
import static io.qameta.allure.Allure.step;


public class searchArticleAboutJavaWithAndroid extends TestBase {
    @Test
    @Tag("android")
    void searchArticleAboutJava() {
            step("Type search", () -> {
                $(accessibilityId("Search Wikipedia")).click();
                $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Java");
            });
            step("Verify content found", () ->
                    $$(id("org.wikipedia.alpha:id/page_list_item_title"))
                            .shouldHave(sizeGreaterThan(0)));
    }
}
