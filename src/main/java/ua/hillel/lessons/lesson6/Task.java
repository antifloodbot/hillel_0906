package ua.hillel.lessons.lesson6;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите: Привет, меня зовут Макс.");
        String str = scanner.nextLine();
        System.out.println(str);

        int count = 0;

        if (str.length() != 0) {
            count++;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    count++;
                }
            }
            System.out.println("Вы ввели " + count + " слов");
        }
    }
}