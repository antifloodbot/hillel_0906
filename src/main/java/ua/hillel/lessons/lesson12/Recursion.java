package ua.hillel.lessons.lesson12;

public class Recursion {
    public static void main(String[] args) {

        int i = factorialRecursion(4);
        System.out.println(i);
    }
    static int factorialRecursion(int x){
        int result;
        if (x < 1){
            return 1;
        }
        result = factorialRecursion(x - 1) * x;
        return result;
    }
    public static int factorial(int x){
        int result =1;
        for(int i = 1; i <= x; i++){
            result *= i;
        }
        return result;
    }
}
