package ua.hillel.homework.hm13;

public class Task20 {
    public static void main(String[] args) {
        int luckyNumber = 3;
        for (int i = 1; i <= 10; i++) {
            if (i == luckyNumber) {
                System.out.println("Вот счастливое число!");
                break;
            }
        }
    }
}