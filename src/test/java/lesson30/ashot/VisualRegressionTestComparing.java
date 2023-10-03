package lesson30.ashot;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class VisualRegressionTestComparing {

    @Test
    public void screenShot() throws IOException {
        open("https://google.com.ua");
        Screenshot screenshot = new AShot().takeScreenshot(getWebDriver());

        BufferedImage expectedImage = ImageIO.read(new File("screen/screen.png"));
        BufferedImage actual = screenshot.getImage();

        ImageDiffer imageDiffer = new ImageDiffer();
        ImageDiff imageDiff = imageDiffer.makeDiff(expectedImage, actual);

        if(imageDiff.hasDiff()){
            Assert.fail("Images are not the same");
        } else {
            System.out.println("Images are same");
        }
    }
}