package lesson29;

import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

public class SelenideMethods {

    @Test
    public void test() {
        SelenideElement element = $("");
        String returnedText = element.text(); //will return text from element
        String returnedAttribute = element.attr("color"); // will return value of attribute color
        String returnedCssValue = element.getCssValue("back-color"); // will return value of css back-color
    }
}
