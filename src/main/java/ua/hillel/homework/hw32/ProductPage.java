package ua.hillel.homework.hw32;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {

    By containsTopPurchases = By.xpath("(//span[contains(text(),'ТОП ПРОДАЖ')])[2]");

    private WebDriver driver;
    private WebDriverWait webDriverWait;

    public ProductPage(WebDriver driver, WebDriverWait webDriverWait) {
        this.webDriverWait = webDriverWait;
        this.driver = driver;
    }

    public WebElement containsTopPurchasesDisplayed() {
        return webDriverWait.until(ExpectedConditions.visibilityOf((WebElement) containsTopPurchases));
    }
}
