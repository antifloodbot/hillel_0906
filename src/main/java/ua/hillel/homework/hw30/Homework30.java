package ua.hillel.homework.hw30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import ua.hillel.homework.hw27.InitialDriver;

import java.util.List;

public class Homework30 extends InitialDriver {

    private final String BASE_URL = "https://rozetka.com.ua/";
    private final String PROMOTIONAL_OFFERS_XPATH = "//h2[contains(text(),'Акционные предложения')]/following-sibling::ul/li";

    @Test
    public void testPromotionalOffers() {
        driver.get(BASE_URL);
        List<WebElement> items = getPromotionalItems();

        Assert.assertEquals(items.size(), 6, "Amount of items is not 6");

        String firstProductExpectedPrice = items.get(0).getAttribute("innerText");
        items.get(0).click();

        WebElement clickedProduct = driver.findElement(By.xpath("//*[@class='product-price__big product-price__big-color-red']"));
        String clickedPrice = clickedProduct.getAttribute("innerText");

        Assert.assertEquals(clickedPrice, firstProductExpectedPrice, "Price is different");

        driver.navigate().back();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, BASE_URL, "URLs are not the same");
        List<WebElement> newItems = getPromotionalItems();

        Assert.assertEquals(newItems.size(), 6, "Amount of items is not 6");
    }

    private List<WebElement> getPromotionalItems() {
        return driver.findElements(By.xpath(PROMOTIONAL_OFFERS_XPATH));
    }
}