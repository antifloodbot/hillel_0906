package ua.hillel.homework.hm3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);
        System.out.println("Введите первое целое число:");
        int digit1 = scannerInt.nextInt();
        System.out.println("Введите второе целое число:");
        int digit2 = scannerInt.nextInt();
        System.out.println("Введите имя:");
        String name = scannerString.nextLine();
        int result = digit1 + digit2;
        System.out.println(name + " " + result);
    }
}
/**
 * 	Пользователю должно быть предложенно ввести два целых числа. Далее должно быть предложенно ввести в консоль имя.
 * 	В переменную result записать сумму двух введенных чисел.
 * 	Ответ должен быть: Имя result.
 * */
