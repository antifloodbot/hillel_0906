package ua.hillel.homework.hm12;

public class Task19 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int newNumber = 777;
        a = addNumber(a, newNumber);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static int[] addNumber(int[] oldArray, int newNumber) {
        int[] newArray = new int[oldArray.length + 1];
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        newArray[oldArray.length] = newNumber;
        return newArray;
    }
}