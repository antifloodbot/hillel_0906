package ua.hillel.homework.hw26;

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

public class homework26 {
    WebDriver driver;
    WebDriverWait webDriverWait;

    @BeforeTest
    public void setupWebDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5000));
    }

    @Test
    public void testLocators() {
        driver.get("https://rozetka.com.ua/");
        WebElement logoCss = webDriverWait.until(ExpectedConditions.elementToBeClickable
                (By.cssSelector("img[alt='Rozetka Logo']")));
        logoCss.click();
        WebElement logoXPath = webDriverWait.until(ExpectedConditions.elementToBeClickable
                (By.xpath("//img[@alt='Rozetka Logo']")));
        logoXPath.click();
        WebElement authButtonCss = webDriverWait.until(ExpectedConditions.elementToBeClickable
                (By.cssSelector("rz-user[class='header-actions__component'] button[type='button']")));
        authButtonCss.click();
        WebElement closeAuthPopupCss = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[aria-label='Закрыть модальное окно']")));
        closeAuthPopupCss.click();
        WebElement authButtonXPath = webDriverWait.until(ExpectedConditions.elementToBeClickable
                (By.xpath("//rz-user[@class='header-actions__component']//button[@type='button']")));
        authButtonXPath.click();
        WebElement closeAuthPopupXPath = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label='Закрыть модальное окно']")));
        closeAuthPopupXPath.click();
        WebElement basketCss = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("rz-cart[class='header-actions__component'] button[type='button']")));
        basketCss.click();
        WebElement closeBasketPopupCss = webDriverWait.until((ExpectedConditions.elementToBeClickable(By.cssSelector("button[aria-label='Закрыть модальное окно']"))));
        closeBasketPopupCss.click();
        WebElement basketXPath = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//rz-cart[@class='header-actions__component']")));
        basketXPath.click();
        WebElement closeBasketPopupXpath = webDriverWait.until((ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label='Закрыть модальное окно']"))));

    }

    @AfterTest
    public void close() {
        driver.close();
    }
}