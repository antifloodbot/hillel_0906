package ua.pageopject.selenide;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.page;

public class CategoryPageLogic extends CategoryPageLocators{

    public SearchPageLogic clickOnSubCategory(String categoryName) {

        SelenideElement element = null;
        for (SelenideElement e : subCategories) {
            if(e.text().equals(categoryName)) {
                System.out.println(e.text());
                element = e;
                break;
            }
        }
        element.click();
        return page(SearchPageLogic.class);
    }
}
