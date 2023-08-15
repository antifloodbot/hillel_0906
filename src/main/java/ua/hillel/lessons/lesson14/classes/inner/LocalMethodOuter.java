package ua.hillel.lessons.lesson14.classes.inner;

public class LocalMethodOuter {

    void myLocalMethod(){
        int num = 888;
        class MethodInnerClass{
            public void print(){
                System.out.println("This is inner class of the method " + num);
            }
        }
        MethodInnerClass methodInnerClass = new MethodInnerClass();
        methodInnerClass.print();
    }
}
