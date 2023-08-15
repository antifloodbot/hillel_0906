package ua.hillel.lessons.lesson4;

public class LoopsExample {
    public static void main(String[] args) {
        forEachExampleString();
    }

    public static void whileExample() {
        int i = 1;
        while (i < 8) {
            i++;
            System.out.println(i);
        }
    }

    public static void whileExample2() {
        int i = 100;
        while (i >= 10) {
            System.out.println("Countdown " + i + " ");
            i -= 10;
        }
    }

    public static void doWhileExample() {
        int i = 1;
        do {
            i++;
            System.out.println(i + " ");
        } while (i < 0);
    }

    public static void forExample() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }

    public static void forEachExampleInt() {
        int[] numbers = {10, 20, 30, 40, 50};
        for (int number : numbers) {
            System.out.println(number);
        }
    }
    public static void forEachExampleString() {
        String[] strings = {"Alex", "Bob", "John"};
        for (String names : strings) {
            System.out.println(names);
        }
    }

    public static void forExampleWithArray() {
        int[] arr = {2, 4, 6};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

