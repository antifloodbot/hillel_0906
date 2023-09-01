package lesson23;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;

public class PracticeIsLabelDisplayedAndWriteInFile {
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
    public void assertTest2() throws IOException {
        driver.get("https://rozetka.com.ua/");
        WebElement inputSearch = driver.findElement(By.name("search"));
        inputSearch.sendKeys("Mac");
        WebElement searchButton = driver.findElement(By.xpath("(//button[contains(text(),'Найти')])[1]"));
        searchButton.click();
        WebElement firstProductTitle = driver.findElement(By.xpath("//span[contains(text(),'Ноутбук Apple MacBook Air 13\" M1 8/256GB 2020 (MGN')]"));
        firstProductTitle.click();

        WebElement inStockLabel = driver.findElement(By.xpath("//p[@class='status-label status-label--green ng-star-inserted']"));
        WebElement inStockLabelColorElement = driver.findElement(By.xpath("//*[contains(@class,'status-label__svg')]"));
        String inStockLabelColor = inStockLabel.getCssValue("color");

        WebElement productPageTitle = driver.findElement(By.xpath("//div[@class='product__heading']//h1"));
        String productPageTitleText = firstProductTitle.getAttribute("innerText");

        WebElement productPrice = driver.findElement(By.xpath("//*[contains(@class,'product-price__big')]"));
        String productPriceText = productPrice.getAttribute("innerText");

        if(inStockLabel.isDisplayed() && inStockLabelColor.equals(EXPECTED_BUY_BTN_COLOR)){
            FileWriter fileWriter = new FileWriter("TitleAndPrice.txt");
            fileWriter.write(productPageTitleText + " - " + productPriceText);
            fileWriter.close();
        }
    }

    @AfterTest
    public void close() {
        driver.close();
    }
}
