package ua.pageopject.selenide;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CategoryPageLocators {

    ElementsCollection subCategories = $$(By.xpath("//a[contains(@class, 'tile-cats__heading')]"));

    SelenideElement subCategories(String category) {
        return $(By.xpath("//div[@class='tile-cats']//a[contains(text(), '" + category + "')]"));
    }
}
