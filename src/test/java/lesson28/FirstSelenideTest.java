package lesson28;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;

public class FirstSelenideTest {

    @BeforeMethod
    public void before() {
        open("https://google.com.ua");
        sleep(5000);
    }

    @Test
    public void selenideTest() {
        $(By.name("q")).setValue("Hillel").pressEnter();
        sleep(5000);
    }

    @Test
    public void selenideSecondTest() {
        $(By.xpath("(//input[@name='btnK'])[2]"))
                .shouldBe(Condition.visible)
                .shouldHave(Condition.value("Google Search"), Duration.ofSeconds(5000))
                .shouldHave(Condition.exactValue("Google Search"))
                .shouldNotHave(Condition.value("Alex"))
                .click();
    }
}
