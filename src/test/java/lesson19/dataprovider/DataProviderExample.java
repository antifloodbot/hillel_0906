package lesson19.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

    @DataProvider(name = "data", parallel = true)
    public Object[][] dataProviderMethod(){
        return new Object[][]{{"chrome, 110"}, {"chrome, 117"}};
    }

    @Test(dataProvider = "data")
    public void testDifferentChromeVersions(String data){
        System.out.println(data);

    }
}
