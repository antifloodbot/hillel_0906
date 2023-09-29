package lesson29;

import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.$;

public class SelenideIsDisplayedAndExist {

    @Test
    public void test(){
        SelenideElement selenideElement = $("");
        selenideElement.isDisplayed(); // true if DOM and Page visible
        selenideElement.exists(); // true if only DOM visible
    }
}
