package lesson22.waits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ImplicitWaitExample {

    WebDriver driver;

    @BeforeTest
    public void setupWebDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
    }

    @Test
    public void testImplicitExample() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");
        WebElement laptops = driver.findElement(By.xpath("//a[@class='menu-categories__link' and contains(text(), 'Ноутбуки')]"));
        laptops.click();
        Thread.sleep(5000);
    }

    @AfterTest
    public void close() {
        driver.close();
    }
}