package lesson23;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class PracticeGetAttribute {
    WebDriver driver;
    WebDriverWait webDriverWait;

    @BeforeTest
    public void setupDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5000));
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
    }

    @Test
    public void assertTest() {
        driver.get("https://rozetka.com.ua/");
        WebElement inputSearch = driver.findElement(By.name("search"));
        inputSearch.sendKeys("Mac");
        WebElement searchBnt = driver.findElement(By.xpath("//button[contains(@class, 'search-form__submit')]"));
        searchBnt.click();
        WebElement firstProductTitle = driver.findElement(By.xpath("//span[@class='goods-tile__title']"));
        String firstProductTitleText = firstProductTitle.getText().trim();
        firstProductTitle.click();
        WebElement productPageTitle = driver.findElement(By.xpath("//div[@class='product__heading']//h1"));
        String productPageTitleText = productPageTitle.getAttribute("innerText");

        Assert.assertEquals(firstProductTitleText, productPageTitleText, "Tittles are not equals!");

    }

    @AfterTest
    public void driverQuit() {
        driver.quit();
    }
}
