package lesson29;

import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideTestSearchElementByText {

    @Test
    public void test(){
        open("https://rozetka.com.ua");
        SelenideElement searchBtn = $(byText("search"));
    }
}
