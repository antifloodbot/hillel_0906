package ua.hillel.homework.hw33;

import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckProductTitlesSelenide {
    @Test
    public void checkProductTitles() {
        Selenide.open("https://rozetka.com.ua/");

        String initialProductTitle = new MainPageSelenide()
                .clickLaptopsAndComputersButton()
                .clickLaptopsButton()
                .saveProductTitleText();

        String addedToCartProductTitle = new LaptopsSelenide()
                .addFirstProductToTheCart()
                .getInCartProductTitle();

        Assert.assertEquals(addedToCartProductTitle, initialProductTitle, "Titles are not the same");
    }
}