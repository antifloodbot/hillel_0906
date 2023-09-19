package ua.hillel.homework.hw31;

import org.openqa.selenium.By;

public class LaptopsLocators {
    By firstProduct = By.xpath("(//button[@aria-label='Купить'])[1]");
    By cartAddedIndication = By.xpath("(//button[@aria-label='В корзине'])[1]");
    By productTitle = By.cssSelector("h1[class='product__title-left product__title-collapsed ng-star-inserted']");
}