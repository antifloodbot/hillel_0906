package ua.hillel.homework.hw32;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaptopsAndComputers {

    By laptops = By.xpath("//a[@title='Ноутбуки'][1]");

    private WebDriver driver;
    private WebDriverWait webDriverWait;

    public LaptopsAndComputers(WebDriver driver, WebDriverWait webDriverWait) {
        this.driver = driver;
        this.webDriverWait = webDriverWait;
    }

    public Laptops clickLaptops() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(laptops)).click();
        return new Laptops(driver, webDriverWait);
    }
}