package lesson26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import ua.hillel.homework.hw27.InitialDriver;

import static java.lang.Thread.sleep;

public class IFramesExample extends InitialDriver {

    @Test
    public void iFrame() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/iframe");

        WebElement frame = driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(frame);

        WebElement input = driver.findElement(By.id("tinymce"));
        input.sendKeys("Hi guys!");

        sleep(5000);
    }
}
