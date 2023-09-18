package ua.hillel.homework.hw31;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPageLogic extends CartPageLocators {

    private WebDriver driver;

    public CartPageLogic(WebDriver driver) {
        this.driver = driver;
    }

    public String getInCartProductTitle() {
        return driver.findElement(inCartTitle).getAttribute("innerText");
    }
}