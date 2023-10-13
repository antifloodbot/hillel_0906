package lesson32;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ua.pageopject.selenide.MainPageLogic;

import static com.codeborne.selenide.Selenide.open;

public class ThirdClassWithSteps {

    @BeforeTest
    public void before(){
        open("https://rozetka.com.ua");
    }
    @Test
    public void test(){
        new MainPageLogic().checkCategoryQuantity(17)
                .clickOnCategoryInSideBar(0)
                .clickOnSubCategory("Ноутбуки")
                .checkingQuantityProductsOnPage(60);
    }
}
