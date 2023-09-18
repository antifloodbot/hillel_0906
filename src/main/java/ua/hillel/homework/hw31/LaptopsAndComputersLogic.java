package ua.hillel.homework.hw31;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaptopsAndComputersLogic extends LaptopsAndComputersLocators {

    private WebDriver driver;
    private WebDriverWait webDriverWait;

    public LaptopsAndComputersLogic(WebDriver driver, WebDriverWait webDriverWait) {
        this.driver = driver;
        this.webDriverWait = webDriverWait;
    }

    public LaptopsPageLogic clickLaptopsButton() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(laptops)).click();
        return new LaptopsPageLogic(driver, webDriverWait);
    }
}
