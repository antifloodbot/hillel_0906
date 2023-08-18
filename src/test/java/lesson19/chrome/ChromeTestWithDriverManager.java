package lesson19.chrome;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromeTestWithDriverManager {
    WebDriver driver;


    @BeforeTest
    public void setupWebDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void testOnChrome(){
        driver.get("https://www.google.com/");
    }

    @AfterTest
    public void close(){
        driver.close();
    }
}
