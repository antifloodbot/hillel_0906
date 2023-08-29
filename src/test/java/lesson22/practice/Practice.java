package lesson22.practice;

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

public class Practice {

    final String EXPECTED_TITLE = "Ноутбук Apple MacBook Air 13\" M1 8/256GB 2020 (MGN63) Space Gray";
    WebDriver driver;
    WebDriverWait webDriverWait;

    @BeforeTest
    public void setupWebDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5000));
    }

    @Test
    public void assertTest() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");
        WebElement inputSearch = driver.findElement(By.name("search"));
        inputSearch.sendKeys("Mac");
        WebElement searchButton = driver.findElement(By.xpath("(//button[contains(text(),'Найти')])[1]"));
        searchButton.click();
        WebElement firstProductTitle = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(text(),'Ноутбук Apple MacBook Air 13\" M1 8/256GB 2020 (MGN')])[1]")));
        String firstProductTitleText = firstProductTitle.getText();

/*        if(!firstProductTitleText.contains("MacBook")){
            System.out.println("Title doesn't contains expected Data");
        } else {
            System.out.println("All OK!");
        }*/
        Assert.assertEquals(firstProductTitleText, EXPECTED_TITLE, "Title doesn't contains expected Data");
    }

    @AfterTest
    public void close() {
        driver.close();
    }
}
