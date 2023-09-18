package ua.hillel.homework.hw31;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.hillel.homework.hw27.InitialDriver;

public class CheckProductTitles extends InitialDriver {

    @Test
    public void checkProductTitles() {
        driver.get("https://rozetka.com.ua/");
        String initialProductTitle = new MainPageLogic(driver, webDriverWait)
                .clickLaptopsAndComputersButton()
                .clickLaptopsButton()
                .saveProductTitleText();

        String addedToCartProductTitle = new LaptopsPageLogic(driver)
                .addFirstProductToTheCart()
                .getInCartProductTitle();

        Assert.assertEquals(addedToCartProductTitle, initialProductTitle, "Titles are not the same");
    }
}