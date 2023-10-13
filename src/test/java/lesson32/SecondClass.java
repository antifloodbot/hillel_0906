package lesson32;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondClass {

    @Test
    public void failTest() {
        Assert.fail("It is fail test");
    }
}
