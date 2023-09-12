package lesson26;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import ua.hillel.homework.hw27.InitialDriver;
import static java.lang.Thread.sleep;

public class OptionExample extends InitialDriver {

    @Test
    public void optionExampleTest() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        Select dropDown = new Select(driver.findElement(By.id("dropdown")));
        sleep(3000);
        dropDown.selectByValue("1");
        sleep(3000);
        dropDown.selectByIndex(2);
        sleep(3000);
    }
}
