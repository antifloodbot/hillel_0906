package ua.hillel.lessons.lesson6;

import java.sql.SQLOutput;

public class SomeStringMethods {
    public static void main(String[] args) {
        valueOfExample();
    }

    public static void equalsExample(String str1, String str2){

        if (str1.equals(str2)){
            System.out.println("Str are equals");
        } else {
            System.out.println("Str not equals");
        }
    }
    public static void equalsIgnoreCaseExample(String str1, String str2){

        if (str1.equalsIgnoreCase(str2)){
            System.out.println("Str are equals");
        } else {
            System.out.println("Str not equals");
        }
    }
    public static void lastIndexOfExample(){
        String str = "hello, my name is Alex";
        System.out.println(str.indexOf("my"));
        System.out.println(str.lastIndexOf("lex"));
    }
    public static void valueOfExample(){
        int num = 3436;
        String str = String.valueOf(num);
        System.out.println(str);

        String actual = "3436";
        System.out.println(actual instanceof String);
        int expected = 3436;
        String expectedStr = String.valueOf(expected);
        System.out.println(actual.equals(expectedStr));
    }
    public static void parseInExample(){
        String actual = "3456";
        int num = Integer.parseInt(actual);
        System.out.println(num == 3456);
    }
}
