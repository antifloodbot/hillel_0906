package ua.pageopject.selenide;
import com.codeborne.selenide.CollectionCondition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.page;

public class MainPageLogic extends MainPageLocators {

    @Step("Checking category quantity {size}")
    public MainPageLogic checkCategoryQuantity(int size){
        categoriesSideBar.shouldHave(CollectionCondition.size(size));
        return this;
    }

    @Step("Clicking on category in side bar {category}")
    public CategoryPageLogic clickOnCategoryInSideBar(int category) {
        categoriesSideBar.get(category).click();
        return page(CategoryPageLogic.class);
    }
}
