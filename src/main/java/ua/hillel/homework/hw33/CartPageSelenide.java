package ua.hillel.homework.hw33;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CartPageSelenide {
    SelenideElement inCartTitle = $("a[data-testid='title']");

    public String getInCartProductTitle() {
        return inCartTitle.getText();
    }
}
