package ua.hillel.homework.hw32;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {

    By laptopAndComputers = By.xpath("//ul[@class='menu-categories menu-categories_type_main']/li[1]");

    private WebDriver driver;
    private WebDriverWait webDriverWait;

    public MainPage(WebDriver driver, WebDriverWait webDriverWait) {
        this.driver = driver;
        this.webDriverWait = webDriverWait;
    }

    public LaptopsAndComputers clickLaptopAndComputers() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(laptopAndComputers)).click();
        return new LaptopsAndComputers(driver, webDriverWait);
    }
}