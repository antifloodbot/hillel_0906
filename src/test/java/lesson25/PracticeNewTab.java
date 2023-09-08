package lesson25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import ua.hillel.homework.hw27.InitialDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static java.lang.Thread.sleep;

public class PracticeNewTab extends InitialDriver {

    @Test
    public void testSwitchTab() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");
        WebElement authButtonXPath = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//rz-user/button")));
        authButtonXPath.click();

        WebElement registerButton = driver.findElement(By.xpath("//button[@class='auth-modal__register-link button button--link ng-star-inserted']"));
        registerButton.click();

        WebElement policyButton = driver.findElement(By.xpath("//a[@class='button button_type_link']"));
        policyButton.click();

        sleep(5000);

        Set<String> windowHandles = driver.getWindowHandles();
        List<String> handle = new ArrayList<>(windowHandles);
        driver.switchTo().window(handle.get(0));

        sleep(5000);

        driver.switchTo().window(handle.get(1));

        sleep(5000);

    }
}