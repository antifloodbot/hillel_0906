package ua.hillel.homework.hw27;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.time.Duration;

public class InitialDriver {
    protected WebDriver driver;
    protected WebDriverWait webDriverWait;

    @BeforeTest
    public void setupWebDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(150000));
        webDriverWait = new WebDriverWait(driver, Duration.ofMillis(150000));
        driver.manage().window().maximize();

    }
    @AfterTest
    public void close() {
        driver.quit();
    }
}
