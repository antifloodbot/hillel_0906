package ua.hillel.lessons.lesson6;

public class ReversExample {
    public static void main(String[] args) {
        reverseExample();
    }
    public static void reverseExample(){
        String[] str = {"My", "name", "is", "Max", "Bye"};
        //n-i-1
        int n = str.length;
        String temp;

        for(int i = 0; i < n / 2; i++){
            temp = str[n-i-1]; //str[4-0-1] = str[3] = Max
            str[n-i-1] = str[i]; // Max = My
            str[i] = temp;
            // Max name is Max
        }
        for (String i : str) {
            System.out.println(i + " ");
        }
    }
}
