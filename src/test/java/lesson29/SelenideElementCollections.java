package lesson29;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$$;

public class SelenideElementCollections {

    @Test
    public void test() {
        ElementsCollection collection = $$("");

        for(SelenideElement e : collection) {
            String text = e.text();
        }
    }
}
