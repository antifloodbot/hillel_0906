package lesson32;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstClass {

    final String LANG_FROM_JENKINS = System.getenv("LANG_FROM_JENKINS");

    @Test()
    @Flaky()
    @Owner("Alex")
    @Lead("Oleg")
    @Description("Test check something")
    @Severity(SeverityLevel.NORMAL)
    @Epic("Checking availability")
    @Feature("Check In - Check Out")
    @Story("User should choose Flexible Dates")
    @Issue("WW-1")
    @TmsLink("tc-1")
    @Link(name = "requirements", url = "https://www.somerequire.com", type = "Trello")
    public void successTest() {
        if(LANG_FROM_JENKINS != null && LANG_FROM_JENKINS.equals("UA")){
            Assert.assertEquals(5, 5);
            System.out.println("LANG_FROM_JENKINS = UA");
        } else {
            Assert.assertEquals(8, 8);
            System.out.println("LANG_FROM_JENKINS = OTHER");
        }
    }
}
