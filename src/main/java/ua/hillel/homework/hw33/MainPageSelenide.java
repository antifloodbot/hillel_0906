package ua.hillel.homework.hw33;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class MainPageSelenide {
    SelenideElement laptopAndComputers = $("//ul[@class='menu-categories menu-categories_type_main']/li[1]");

    public LaptopsAndComputersSelenide clickLaptopsAndComputersButton() {
        laptopAndComputers.click();
        return new LaptopsAndComputersSelenide();
    }
}