package ua.hillel.homework.testconnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import ua.hillel.homework.hw27.InitialDriver;

import static java.lang.Thread.sleep;

public class AmazonTest extends InitialDriver {

    @Test
    public void testAmazon() throws InterruptedException {
        driver.get("https://www.amazon.com/");
        WebElement deals = driver.findElement(By.xpath("//a[@href='/gp/goldbox?ref_=nav_cs_gb']"));
        deals.click();

        WebElement good = driver.findElement(By.xpath("//img[@alt='Boost Infinite Unlocked Phone SIM Kit']"));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(good));

        good.click();

        WebElement addToCart = driver.findElement(By.xpath("//button[@id='a-autoid-0-announce']"));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(addToCart));

        addToCart.click();

        sleep(5000);

    }
}
