package lesson19.chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromeTestWithDriver {

    WebDriver driver;

    @BeforeClass
    public void initWebDriver(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
    }

    @BeforeTest
    public void setupWebDriver(){
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
