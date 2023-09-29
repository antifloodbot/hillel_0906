package lesson29;

import org.testng.annotations.Test;
import ua.pageopject.selenide.MainPageLogic;

import static com.codeborne.selenide.Selenide.open;

public class PracticeSelenideElements {

    @Test
    public void test(){
        open("https://rozetka.com.ua");
        new MainPageLogic().checkCategoryQuantity(17)
                .clickOnCategoryInSideBar(0)
                .clickOnSubCategory("Ноутбуки")
                .checkingQuantityProductsOnPage(60);
    }
}
