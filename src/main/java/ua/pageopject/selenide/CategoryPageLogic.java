package ua.pageopject.selenide;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.util.Objects;

import static com.codeborne.selenide.Selenide.page;

public class CategoryPageLogic extends CategoryPageLocators{

    @Step("Click on sub category {categoryName}")
    public SearchPageLogic clickOnSubCategory(String categoryName) {

        SelenideElement element = null;
        for (SelenideElement e : subCategories) {
            if(e.text().trim().equals(categoryName)) {
                System.out.println(e.text());
                element = e;
                break;
            }
        }
        Objects.requireNonNull(element).click();
        return page(SearchPageLogic.class);
    }
}
