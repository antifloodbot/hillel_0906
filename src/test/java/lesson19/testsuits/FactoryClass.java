package lesson19.testsuits;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class FactoryClass {
    @Factory
    @Test
    public Object[] testWithFactory(){
        Object[] objects = new Object[2];
        objects[0] = new FactoryClass();
        objects[1] = new SecondClass();
        return objects;
    }
}
