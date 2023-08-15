package ua.hillel.lessons.lesson8;

public class Division {
    public static void main(String[] args) {
        divisionExample2();
    }
    public static void divisionExample(){
        int n = 9;
        int k = 4;
        int m = n % k;
        System.out.println(m);
    }
    public static void divisionExample2(){
        int year;
        int twoDigit;
        year = 2013;
        twoDigit = year % 100;
        System.out.println(twoDigit);
    }
}
