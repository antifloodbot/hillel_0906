package ua.hillel.lessons.lesson5.methods;

public class MethodsWithParam {
    public static void main(String[] args) {
        sum(4, 4);
        sayName("Bob");
        System.out.println(sum2(10, 10));
        sayNameAndAge("alex", 33);
    }

    public static void sayName(String name) {
        System.out.println(name);
    }

    public static void sum(int number1, int number2) {
        int result = number1 + number2;
        System.out.println(result);
    }

    public static int sum2(int number1, int number2) {
        int result = number1 + number2;
        return result;
    }

    public static void sayNameAndAge(String name, int age) {
        if (age == 33) {
            System.out.println(name + " " + age);
        } else {
            System.out.println("don't know such age");
        }
    }
}
