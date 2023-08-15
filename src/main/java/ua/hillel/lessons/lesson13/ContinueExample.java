package ua.hillel.lessons.lesson13;

public class ContinueExample {
    public static void main(String[] args) {
        for(int i = 1; i <= 7; i++){
            System.out.println(i + " I am here before continue");
            if (i > 2)
                continue;
            System.out.println("      " + i + " I am here 2 times");
        }
    }
}