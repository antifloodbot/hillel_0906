package ua.hillel.homework.hm3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число на выбор 1, 2 или 3:");
        int digit = scanner.nextInt();
        if (digit == 1 || digit == 2 || digit == 3) {
            System.out.println("Вы ввели число " + digit);
        } else {
            System.out.println("Вы ввели число не равное 1, 2 или 3");
        }
    }
}
/**
 * Необходимо написать программу,
 * где бы пользователю предлагалось ввести число на выбор: 1, 2 или 3, а программа должна сказать,
 * какое число ввёл пользователь: 1, 2, или 3 и в том случаи,
 * если пользователь ввёл какое-либо другое число программа должна отвечать
 * „Вы ввели число не равное 1, 2 или 3“
 * */