package ua.hillel.homework.hw33;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LaptopsAndComputersSelenide {
    SelenideElement laptops = $("//a[@title='Ноутбуки'][1]");

    public LaptopsSelenide clickLaptopsButton() {
        laptops.click();
        return new LaptopsSelenide();
    }
}
