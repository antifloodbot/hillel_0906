package ua.hillel.lessons.lesson14.classes.inner;

public class Launch {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.showInner();

        StaticOuter.InnerStaticDemo staticOuter = new StaticOuter.InnerStaticDemo();
        staticOuter.my_method();

        LocalMethodOuter localMethodOuter = new LocalMethodOuter();
        localMethodOuter.myLocalMethod();
    }
}
