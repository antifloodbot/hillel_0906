package ua.hillel.lessons.lesson3;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        method4();
    }
    public static void method4(){
        System.out.println("Enter any phrase: ");
        Scanner scanner = new Scanner(System.in);
        String phrase = scanner.next();
        System.out.println("You enter phrase: " + phrase);
    }
    public static void method3(){
        System.out.println("Enter any phrase: ");
        Scanner scanner = new Scanner(System.in);
        String phrase = scanner.nextLine();
        System.out.println("You enter phrase: " + phrase);
    }
    public static void method2(){
        System.out.println("Enter any two digit");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int result = num1 + num2;
        System.out.println("Result: " + result);
    }

    public static void method1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter int:");
        int numberInt = scanner.nextInt();
        int result = numberInt + 100;
        System.out.println("Entered - " + numberInt);
        System.out.println("Result - " + result);
    }
}
