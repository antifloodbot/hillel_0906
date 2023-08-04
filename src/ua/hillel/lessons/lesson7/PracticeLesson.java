package ua.hillel.lessons.lesson7;

import java.util.Random;

public class PracticeLesson {
    public static void main(String[] args) {
        int[] array = new int[8];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Max digit is " + max);
        for(int a : array){
            System.out.println(a);
        }
    }
}
