package ua.pageopject.selenide;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$$;

public class SearchPageLocators {
    ElementsCollection titlesOfProducts = $$(By.xpath("//span[@class='goods-tile__title']"));
}
