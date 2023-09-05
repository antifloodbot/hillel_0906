package ua.hillel.homework.hw27;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import static java.lang.Thread.sleep;

public class Homework27 extends InitialDriver{

    @Test
    public void testTopPurchases() throws InterruptedException {

        driver.get("https://rozetka.com.ua/");
        WebElement laptopAndComputers = driver
                .findElement(By.xpath("//ul[@class='menu-categories menu-categories_type_main']/li[1]"));
        laptopAndComputers.click();
        WebElement laptops = driver.findElement(By.xpath("//a[@title='Ноутбуки'][1]"));
        laptops.click();
        WebElement filterRozetkaSeller = driver.findElement(By.xpath("//a[@data-id='Rozetka']"));
        filterRozetkaSeller.click();
        sleep(3000);

        WebElement filterPriceMax = driver.findElement(By.xpath("//input[@formcontrolname='max']"));
        filterPriceMax.clear();
        filterPriceMax.sendKeys("100000");
        WebElement firstElementTopPurchases = driver.findElement(By.xpath("//button[@type='submit']"));
        firstElementTopPurchases.click();

        List<WebElement> elements = driver
                .findElements(By.xpath("//span[text()=' ТОП ПРОДАЖ ']/ancestor::div[@class='goods-tile__inner']"));

        if(!elements.isEmpty()){
            elements.get(0).click();
            sleep(3000);
        } else {
            System.out.println("Elements not found");
        }

        WebElement containsTopPurchases = driver.findElement(By.xpath("(//span[contains(text(),'ТОП ПРОДАЖ')])[2]"));

        Assert.assertTrue(containsTopPurchases.isDisplayed(), "Logo is not displayed");

    }
}