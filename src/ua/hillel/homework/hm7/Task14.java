package ua.hillel.homework.hm7;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1, num2, operation);
        System.out.println("Результат: " + result);
    }

    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите целое число: ");
        int number = scanner.nextInt();
        return number;

    }

    public static char getOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите +, -, * или /: ");
        char operation = scanner.next().charAt(0);
        return operation;
    }

    public static int calc(int num1, int num2, char operation) {
        int result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Недопустимая операция " + operation);
        }
        return result;
    }
}
