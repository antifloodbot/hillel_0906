package lesson19.chrome;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
    public void testOnChrome() throws InterruptedException {
        driver.get("https://www.google.com/");
        WebElement inputSearch = driver.findElement(By.name("q"));
        WebElement searchButton = driver.findElement(By.name("btnK"));
        Thread.sleep(3000);
        inputSearch.sendKeys("Hillel");
        Thread.sleep(3000);
        searchButton.click();
        Thread.sleep(2000);
    }

    @AfterTest
    public void close(){
        driver.close();
    }
}
