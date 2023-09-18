package ua.hillel.homework.hw31;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaptopsPageLogic extends LaptopsLocators {

    private WebDriver driver;
    private WebDriverWait webDriverWait;

    public LaptopsPageLogic(WebDriver driver, WebDriverWait webDriverWait) {
        this.driver = driver;
        this.webDriverWait = webDriverWait;
    }

    public LaptopsPageLogic(WebDriver driver) {
        this.driver = driver;
    }

    public String saveProductTitleText() {
        return driver.findElement(productTitle).getAttribute("innerText");
    }

    public CartPageLogic addFirstProductToTheCart() {
        webDriverWait.until(ExpectedConditions.visibilityOf((WebElement) firstProduct)).click();
        webDriverWait.until(ExpectedConditions.visibilityOf((WebElement) cartAddedIndication)).click();
        return new CartPageLogic(driver);
    }
}