package lesson25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import ua.hillel.homework.hw27.InitialDriver;

public class PracticeSelected extends InitialDriver {

    @Test
    public void selectedTest(){

        driver.get("https://rozetka.com.ua/");
        WebElement authButtonXPath = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//rz-user/button")));
        authButtonXPath.click();
        WebElement labelRememberMe = driver.findElement(By.xpath("//label[@for='remember_me']"));
        WebElement inputRememberMe = driver.findElement(By.id("remember_me"));

        System.out.println(inputRememberMe.isSelected()); //true
        labelRememberMe.click();
        System.out.println(inputRememberMe.isSelected()); //false

    }
}