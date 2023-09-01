package lesson23;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class PracticeInDomExist {
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
    public void assertTest() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");
        List<WebElement> zsu = driver.findElements(By.xpath("//*[@class = 'help-zsu header-actions__component']"));

        if (zsu.size() > 0) {
            System.out.println("logo in dom");
        } else {
            Assert.fail("logo not in dom");
        }

        Thread.sleep(3000);

    }

    @AfterTest
    public void close() {
        driver.close();
    }
}
