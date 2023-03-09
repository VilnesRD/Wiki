package wikiTests.mobileTests.IOSTests;

import org.junit.jupiter.api.Test;
import wikiTests.mobileTests.TestBase;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.openqa.selenium.By.id;

public class LoginTestIOS extends TestBase {
    @Owner("Rodichev")
    @Test
    @Tag("ios")
    void loginTestFlight (){
        step("Click button", () ->{
            $(id("Text Button")).click();
        });
        step("Write email on text area", () ->{
            $(id("Text Input")).click();
            $(id("Text Input")).sendKeys("123@io.com");
            $(id("Text Input")).pressEnter();
        });
        step("Check result", () ->{
            assertEquals("123@io.com", $(id("Text Output")).getText());
        });
    }
}
