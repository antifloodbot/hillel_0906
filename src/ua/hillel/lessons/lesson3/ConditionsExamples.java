package ua.hillel.lessons.lesson3;

public class ConditionsExamples {
    public static void main(String[] args) {
        method2();
    }
    public static void method2(){
        int a = 7;
        int b = 6;
        if(a == b){
            System.out.println("digits are the same");
        } else if (a > b){
            System.out.println("a greater then b");
        } else {
            System.out.println("a less then b");
        }
    }
    public static void method1(){
        int a = 7;
        int b = 6;
        if(a == b){
            System.out.println("digits are the same");
        } else {
            System.out.println("digits are not same");
        }
    }
}
