package ua.hillel.lessons.lesson9;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {11, 3, 14, 16, 7, 0, 0, 2, 100, 4};
        boolean isSorted = false;
        int temp;
        while(!isSorted){
            isSorted = true;
            for(int i = 0; i < array.length - 1; i++){
                if(array[i] > array[i + 1]){
                    isSorted = false;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        for (int arr : array){
            System.out.print(arr + " ");
        }
    }
}
