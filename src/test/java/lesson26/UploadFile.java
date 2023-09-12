package lesson26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import ua.hillel.homework.hw27.InitialDriver;

import static java.lang.Thread.sleep;

public class UploadFile extends InitialDriver {

    @Test
    public void uploadFile() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/upload");

        WebElement fileUpload = driver.findElement(By.id("file-upload"));
        fileUpload.sendKeys("/Users/ktalamaniuk/IdeaProjects/hillel_0906/text.txt");

        WebElement uploadButton = driver.findElement(By.id("file-submit"));
        uploadButton.submit();

        sleep(5000);
    }
}
