package ua.hillel.lessons.lesson5.twodimarray;

import java.util.Arrays;

public class DimArrayExample {
    public static void main(String[] args) {
        deepToString();
    }
    public static void emptyDimArray(){
        int[][] twoDimArray = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11}
        };
        for(int i = 0; i < twoDimArray.length; i++){ //цикл для строк
            for(int k = 0; k < twoDimArray[i].length; k++){ //цикл для столбцов
                System.out.print(" " + twoDimArray[i][k] + " ");
            } System.out.println();
        }

        /**int [][] twoDimArray2 = new int[3][4];
        twoDimArray[0][0] = 1;
        twoDimArray[0][1] = 2;
        twoDimArray[0][2] = 3;
        twoDimArray[0][3] = 4;
        twoDimArray[1][0] = 5;
        twoDimArray[1][1] = 6;
        twoDimArray[1][2] = 7;
        twoDimArray[1][3] = 8;
        twoDimArray[2][0] = 9;
        twoDimArray[2][1] = 10;
        twoDimArray[2][2] = 11;
        twoDimArray[2][3] = 12;
        System.out.println(twoDimArray[0][1]);*/
    }
    public static void deepToString(){
        int[][] twoDimArray = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11}
        };
        System.out.println(Arrays.deepToString(twoDimArray));
    }
}
