package ua.hillel.lessons.lesson5.methods;

public class MethodExample {
    public static void main(String[] args) {
        System.out.println(returnHelloImperative());
        String sayHello = returnHelloImperative();
        System.out.println(sayHello);

        System.out.println(plusImp());
        int minus = plusImp() -1;
        System.out.println(minus);
        System.out.println(returnHelloDeclarative());
    }
    public static int plusImp(){
        int result = 2 + 2;
        return result;
    }
    public static int plusDecl(){
        return 2 + 2;
    }
    public static String returnHelloImperative(){
        String helloSTR = "HI1";
        return helloSTR;
    }
    public static String returnHelloDeclarative(){
        return "HI2";
    }
    public static void sayHello(){
        System.out.println("hello");
    }
}
