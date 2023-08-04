package ua.hillel.homework.hm9;

public class Task17withChar {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        char[] arrayChar = new char[10];

        for (int i = 0; i < 10; i++) {
            if (array[i] % 2 == 0) {
                arrayChar[i] = 'Y';
            } else {
                arrayChar[i] = (char) (array[i] + '0');
            }
        }
        for (char i : arrayChar) {
            System.out.print(i + " ");
        }
    }
}