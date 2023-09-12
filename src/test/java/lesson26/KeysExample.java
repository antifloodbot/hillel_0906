package lesson26;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import ua.hillel.homework.hw27.InitialDriver;

import static java.lang.Thread.sleep;

public class KeysExample extends InitialDriver {

    @Test
    public void keysTest() throws InterruptedException {
        driver.get("https://www.google.com.ua/");

        sleep(5000);

        WebElement input = driver.findElement(By.name("q"));
        input.sendKeys(Keys.chord(Keys.SHIFT, "Hello"));

        sleep(5000);

        input.sendKeys(Keys.ENTER);

        sleep(5000);
    }
}
