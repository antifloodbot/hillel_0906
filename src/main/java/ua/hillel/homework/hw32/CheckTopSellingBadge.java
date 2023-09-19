package ua.hillel.homework.hw32;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import ua.hillel.homework.hw27.InitialDriver;

public class CheckTopSellingBadge extends InitialDriver {

    @Test
    public void isTopSellsBadgeDisplayed() {
        driver.get("https://rozetka.com.ua/");
        WebElement topSellsBadge = new MainPage(driver, webDriverWait)
                .clickLaptopAndComputers()
                .clickLaptops()
                .clickFirstElementTopPurchases()
                .containsTopPurchasesDisplayed();

        Assert.assertTrue(topSellsBadge.isDisplayed(), "Badge is not displayed");
    }
}