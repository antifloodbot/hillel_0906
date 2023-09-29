package ua.pageopject.selenide;

import com.codeborne.selenide.CollectionCondition;

public class SearchPageLogic extends SearchPageLocators{

    public SearchPageLogic checkingQuantityProductsOnPage(int size) {
        titlesOfProducts.shouldHave(CollectionCondition.size(size));
        return this;
    }
}
