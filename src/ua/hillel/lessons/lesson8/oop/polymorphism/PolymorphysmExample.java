package ua.hillel.lessons.lesson8.oop.polymorphism;

public class PolymorphysmExample {
    public static void main(String[] args) {
        System.out.println(add());
        System.out.println(add(1,2));
        System.out.println(add("3","2"));


    }
    public static int add(int a, int b){
        return a + b;
    }
    public static String add(String a, String b){
        return a+ b;
    }
    public static String add(){
        return "a" + "b";
    }
}
