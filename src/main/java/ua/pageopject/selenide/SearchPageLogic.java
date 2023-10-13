package ua.pageopject.selenide;

import com.codeborne.selenide.CollectionCondition;
import io.qameta.allure.Step;

public class SearchPageLogic extends SearchPageLocators{

    @Step("Checking quantity products on page {size}")
    public SearchPageLogic checkingQuantityProductsOnPage(int size) {
        titlesOfProducts.shouldHave(CollectionCondition.size(size));
        return this;
    }
}
