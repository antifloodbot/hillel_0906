package ua.hillel.homework.hw27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Homework27 extends InitialDriver {

    @Test
    public void testTopPurchases() {

        driver.get("https://rozetka.com.ua/");

        WebElement laptopAndComputers = driver
                .findElement(By.xpath("//ul[@class='menu-categories menu-categories_type_main']/li[1]"));
        laptopAndComputers.click();
        WebElement laptops = driver.findElement(By.xpath("//a[@title='Ноутбуки'][1]"));
        laptops.click();

        WebElement filterRozetkaSeller = driver.findElement(By.xpath("//a[@data-id='Rozetka']"));
        filterRozetkaSeller.click();

        WebElement isRozetkaFilterApplied = driver.findElement(By.xpath("//*[@class='catalog-selection__link']"));
        webDriverWait.until(ExpectedConditions.visibilityOf(isRozetkaFilterApplied));

        WebElement filterPriceMax = driver.findElement(By.xpath("//input[contains(@class, 'slider-filter__input')][2]"));
        filterPriceMax.clear();
        filterPriceMax.sendKeys("100000");

        WebElement firstElementTopPurchases = webDriverWait.
                until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
        firstElementTopPurchases.click();
        WebElement isPriceFilterSelected = driver.findElement(By.xpath("//a[@class='catalog-selection__link']"));
        webDriverWait.until(ExpectedConditions.visibilityOf(isPriceFilterSelected));

        List<WebElement> elements = driver
                .findElements(By.xpath("//span[text()=' ТОП ПРОДАЖ ']/ancestor::div[@class='goods-tile__inner']"));
        if (!elements.isEmpty()) {
            elements.get(0).click();
        } else {
            System.out.println("Elements not found");
        }

        WebElement containsTopPurchases = driver.findElement(By.xpath("(//span[contains(text(),'ТОП ПРОДАЖ')])[2]"));
        webDriverWait.until(ExpectedConditions.visibilityOf(containsTopPurchases));
        Assert.assertTrue(containsTopPurchases.isDisplayed(), "Logo is not displayed");

    }
}