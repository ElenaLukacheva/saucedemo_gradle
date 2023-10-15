import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$x;

public class loginTest {
    @BeforeAll
    static void beforeAll() {
       // Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://www.saucedemo.com";
    }

    @AfterAll
    static void afterAll() {
    }

    @Test
    void testlogin() {
        open("");
        $(".login_logo").shouldHave(text("Swag Labs"));
        $("#user-name").setValue("standard_user");
        $("#password").setValue("secret_sauce");
        $("#login-button").click();

        $(".inventory_list").shouldBe(visible);
    }

    @Test
    void testAddBasket() {
        open("https://www.saucedemo.com/");
        $(".login_logo").shouldHave(text("Swag Labs"));
        $("#user-name").setValue("standard_user");
        $("#password").setValue("secret_sauce");
        $("#login-button").click();
        $(byXpath("//button[@name = 'add-to-cart-sauce-labs-backpack']")).click();
        String add = $(By.xpath("//button[@name = 'remove-sauce-labs-backpack']")).getText();

        Assertions.assertTrue(add.contains("Remove"));
        $(".shopping_cart_badge").shouldHave(text("1"));

        $(byXpath("//div[@id = 'shopping_cart_container']")).click();



    }
}
