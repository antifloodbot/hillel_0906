package lesson19.testsuits;

import lesson19.listener.MyListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Listeners(MyListener.class)
public class FirstClass {

    @Parameters({"username", "password"})

    @Test(groups = {"regression"})
    public void firstTest(String username, String password){
        System.out.println("it is first test");
        System.out.println(username);
        System.out.println(password);
    }

    @Test
    public void secondTest(){
        System.out.println("it is second test");
    }
}
