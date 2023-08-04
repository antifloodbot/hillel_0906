package ua.hillel.lessons.lesson14.classes.inner;

public class Outer {
    int num;
    void showInner(){
        InnerDemo innerDemo = new InnerDemo();
        innerDemo.print();
    }

    private class InnerDemo{
        public void print(){
            System.out.println("This is Inner Demo class");
        }
    }
}
