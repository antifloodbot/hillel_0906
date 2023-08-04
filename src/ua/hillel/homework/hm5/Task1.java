package ua.hillel.homework.hm5;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(minOfTwo(5, 10));
    }

    public static int returnMinimalDigit(int digit1, int digit2) {
        if (digit1 < digit2) {
            return digit1;
        } else if (digit1 > digit2) {
            return digit2;
        } else {
            return digit1;
        }
    }

    public static int smallerNumber(int number1, int number2) {
        if (number1 > number2) {
            return number2;
        } else if (number1 == number2) {
            System.out.println("These numbers are equal");
        } else {
            return number1;
        }
        return 0;
    }

    public static int lowerNumber(int numb1, int numb2) {
        if (numb1 > numb2) {
            return numb2;
        } else {
            return numb1;
        }
    }

    public static int minOfTwo(int number1, int number2) {
        if (number1 > number2) {
            number1 = number2;
        }
        return number1;
    }
}