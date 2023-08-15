package ua.hillel.lessons.lesson4;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        conditionString();
    }
    public static void conditionInt(){
        System.out.println("Enter 1, 2 or 3");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("Entered 1");
                break;
            case 2:
                System.out.println("Entered 2");
                break;
            case 3:
                System.out.println("Entered 3");
                break;
            default:
                System.out.println("Unknown number");
        }
    }
    public static void conditionString(){
            System.out.println("Enter month");
            Scanner scanner = new Scanner(System.in);
            String number = scanner.next();
            switch (number) {
                case "Jan":
                    System.out.println("Entered Jan");
                    break;
                case "Jul":
                    System.out.println("Entered Jul");
                    break;
                case "Feb":
                    System.out.println("Entered Feb");
                    break;
                default:
                    System.out.println("Unknown month");
            }
    }
}
