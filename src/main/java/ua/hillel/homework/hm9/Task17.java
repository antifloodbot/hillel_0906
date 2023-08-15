package ua.hillel.homework.hm9;

public class Task17 {
    public static void main(String[] args) {
        String[] array = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        for (int i = 0; i < array.length; i++) {
            int num = Integer.parseInt(array[i]);
            if (num % 2 == 0) {
                array[i] = "Y";
            }
        }

        for (String element : array) {
            System.out.print(element + " ");
        }
    }
}