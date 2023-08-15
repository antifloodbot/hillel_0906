package ua.hillel.homework.hm6;

public class Task1 {
    public static void main(String[] args) {
        pyramidExample();

        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i - 1; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    public static void pyramidExample() {
        int rows = 5;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
/**
 * С помощью циклов FOR вывести в консоль пирамиду из звездочек.
 *     *
 *    * *
 *   * * *
 *  * * * *
 * * * * * *
 */
