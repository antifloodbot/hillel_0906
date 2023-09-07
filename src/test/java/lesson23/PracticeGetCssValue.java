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

public class PracticeGetCssValue {
    final String EXPECTED_BUY_BTN_COLOR = "rgba(0, 160, 70, 1)";
    WebDriver driver;
    WebDriverWait webDriverWait;

    @BeforeTest
    public void setupWebDriver() {
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
        WebElement searchButton = driver.findElement(By.xpath("(//button[contains(text(),'Найти')])[1]"));
        searchButton.click();
        WebElement firstProductTitle = driver.findElement(By.xpath("//span[contains(text(),'Ноутбук Apple MacBook Air 13\" M1 8/256GB 2020 (MGN')]"));
        firstProductTitle.click();
        WebElement buyBtn = driver.findElement(By.xpath("//button[@class='buy-button button button--with-icon button--green button--medium buy-button--tile ng-star-inserted']"));
        String buyBtnColor = buyBtn.getCssValue("background-color");


        Assert.assertEquals(buyBtnColor, EXPECTED_BUY_BTN_COLOR, "Button color is wrong");
    }

    @AfterTest
    public void close() {
        driver.close();
    }
}
