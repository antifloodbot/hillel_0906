package ua.hillel.homework.hm3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1:");
        int digit = scanner.nextInt();
        if (digit == 1) {
            System.out.println("Вы ввели число 1");
        } else {
            System.out.println("Вы ввели число не равное 1");
        }
    }
}
/**
 * Необходимо написать программу, где бы пользователю предлагалось ввести число 1.
 * Если пользователь ввёл число 1, программа должна вывести сообщение: "Вы ввели число 1".
 * Если пользователь ввёл другое число, программа должна вывести такое сообщение: "Вы ввели число не равное 1"
 * */