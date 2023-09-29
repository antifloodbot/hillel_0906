package ua.hillel.homework.hw31;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPageLogic extends MainPageLocators {

    private WebDriver driver;
    private WebDriverWait webDriverWait;

    public MainPageLogic(WebDriver driver, WebDriverWait webDriverWait) {
        this.driver = driver;
        this.webDriverWait = webDriverWait;
    }

    public LaptopsAndComputersLogic clickLaptopsAndComputersButton() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(laptopAndComputers)).click();
        return new LaptopsAndComputersLogic(driver, webDriverWait);
    }
}