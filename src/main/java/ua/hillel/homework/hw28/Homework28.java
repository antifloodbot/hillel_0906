package ua.hillel.homework.hw28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import ua.hillel.homework.hw27.InitialDriver;

import static java.lang.Thread.sleep;

public class Homework28 extends InitialDriver {

    @Test
    public void addProductToTheCart() {
        driver.get("https://rozetka.com.ua/");

        WebElement laptopAndComputers = driver
                .findElement(By.xpath("//ul[@class='menu-categories menu-categories_type_main']/li[1]"));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(laptopAndComputers));
        laptopAndComputers.click();

        WebElement laptops = driver.findElement(By.xpath("//a[@title='Ноутбуки'][1]"));
        laptops.click();

        WebElement cartButton = driver.findElement(By.xpath("(//button[@aria-label='Купить'])[1]"));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(cartButton));
        cartButton.click();

        WebElement cartAddedIndication = driver.findElement(By.xpath("(//button[@aria-label='В корзине'])[1]"));
        webDriverWait.until(ExpectedConditions.visibilityOf(cartAddedIndication));

        WebElement productTitle = driver.findElement(By.cssSelector("h1[class='product__title-left product__title-collapsed ng-star-inserted']"));
        String productTitleText = productTitle.getAttribute("innerText");

        cartAddedIndication.click();

        WebElement inCartProductTitle = driver.findElement(By.cssSelector("a[data-testid='title']"));
        String productInCartText = inCartProductTitle.getAttribute("innerText");

        Assert.assertEquals(productInCartText, productTitleText, "Wrong product");

    }
}