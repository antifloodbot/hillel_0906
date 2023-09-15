package ua.hillel.homework.hw29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import ua.hillel.homework.hw27.InitialDriver;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Homework29 extends InitialDriver {

    @Test
    public void saveProductsIntoFile() {
        driver.get("https://rozetka.com.ua/notebooks/c80004/");
        List<WebElement> products = driver.findElements(By.xpath("//*[@class='goods-tile__title']"));
        List<WebElement> prices = driver.findElements(By.xpath("//*[@class='goods-tile__price-value']"));

        Map<String, String> productPriceMap = new HashMap<>();

        for (int i = 0; i < products.size(); i++) {
            String fullTitle = products.get(i).getText();
            String shortTitle = fullTitle.split(" / ")[0];

            String fullPrice = prices.get(i).getText();
            String shortPrice = fullPrice.replace("₴", "").trim();

            productPriceMap.put(shortTitle, shortPrice);
        }

        try {
            FileWriter writer = new FileWriter("rozetkaTest.txt");
            for (Map.Entry<String, String> entry : productPriceMap.entrySet()) {
                String outputLine = entry.getKey() + " - " + entry.getValue();
                writer.write(outputLine + System.lineSeparator());
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}