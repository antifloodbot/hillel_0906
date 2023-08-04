package ua.hillel.homework.hm5;

public class Task2 {
    public static void main(String[] args) {
        char[][] charArray = {{'*', '*', '*', '*', '*'}, {'*', '*', '*', '*', '*'}, {'*', '*', '*', '*', '*'}};
        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < charArray[i].length; j++) {
                System.out.print(charArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}