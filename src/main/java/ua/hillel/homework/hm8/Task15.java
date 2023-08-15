package ua.hillel.homework.hm8;

import java.util.Random;

public class Task15 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        double average = (double) sum / array.length;
        System.out.println("Среднее арифметическое: " + average);
    }
}