package ua.hillel.homework.hw33;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LaptopsSelenide {
    SelenideElement firstProduct = $("(//button[@aria-label='Купить'])[1]");
    SelenideElement cartAddedIndication = $("(//button[@aria-label='В корзине'])[1]");
    SelenideElement productTitle = $("h1[class='product__title-left product__title-collapsed ng-star-inserted']");

    public String saveProductTitleText() {
        return productTitle.getText();
    }

    public CartPageSelenide addFirstProductToTheCart() {
        firstProduct.click();
        cartAddedIndication.click();
        return new CartPageSelenide();
    }

}
