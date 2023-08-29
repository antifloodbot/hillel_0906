package lesson22.waits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExplicitWaitExample {

    WebDriver driver;
    WebDriverWait webDriverWait;

    @BeforeTest
    public void setupWebDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5000));
    }

    @Test
    public void testExplicitExample() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");
        WebElement laptops = webDriverWait.until(ExpectedConditions.elementToBeClickable
                (By.xpath("//a[@class='menu-categories__link' and contains(text(), 'Ноутбуки')]")));
        laptops.click();
        Thread.sleep(5000);
    }

    @Test
    public void testExplicitExample2() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");
        WebElement laptops = (new WebDriverWait(driver, Duration.ofSeconds(5000))).
                until(ExpectedConditions.
                        elementToBeClickable(By.xpath("//a[@class='menu-categories__link' and contains(text(), 'Ноутбуки')]")));
        laptops.click();
        Thread.sleep(5000);
    }

    @AfterTest
    public void close() {
        driver.close();
    }
}
