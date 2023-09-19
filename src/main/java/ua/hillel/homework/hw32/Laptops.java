package ua.hillel.homework.hw32;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Laptops {

    By filterRozetkaSeller = By.xpath("//a[@data-id='Rozetka']");
    By isRozetkaFilterApplied = By.xpath("//*[@class='catalog-selection__link']");
    By filterPriceMax = By.xpath("//input[contains(@class, 'slider-filter__input')][2]");
    By submitPriceFilterButton = By.xpath("//button[@type='submit']");
    By isPriceFilterSelected = By.xpath("//a[@class='catalog-selection__link']");
    By elements = By.xpath("//span[text()=' ТОП ПРОДАЖ ']/ancestor::div[@class='goods-tile__inner']");

    private WebDriver driver;
    private WebDriverWait webDriverWait;

    public Laptops(WebDriver driver, WebDriverWait webDriverWait) {
        this.driver = driver;
        this.webDriverWait = webDriverWait;
    }

    private void applyRozetkaFilter(){
        webDriverWait.until(ExpectedConditions.visibilityOf((WebElement) filterRozetkaSeller)).click();
        webDriverWait.until(ExpectedConditions.visibilityOf((WebElement) isRozetkaFilterApplied));
    }

    private void applyPriceFilter() {
        driver.findElement(filterPriceMax).clear();
        driver.findElement(filterPriceMax).sendKeys("10000");
        webDriverWait.until(ExpectedConditions.elementToBeClickable(submitPriceFilterButton)).click();
        webDriverWait.until(ExpectedConditions.visibilityOf((WebElement) isPriceFilterSelected));
    }

    private void getListWithTopSellBadge() {
        List<WebElement> elementsList = driver.findElements(elements);
        if (!elementsList.isEmpty()) {
            elementsList.get(0).click();
        } else {
            System.out.println("Elements not found");
        }
    }

    public ProductPage clickFirstElementTopPurchases() {
        applyRozetkaFilter();
        applyPriceFilter();
        getListWithTopSellBadge();
        return new ProductPage(driver, webDriverWait);
    }
}