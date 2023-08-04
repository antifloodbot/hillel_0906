package ua.hillel.lessons.lesson6;

public class RoundExample {
    public static void main(String[] args) {
        floorExample();
    }
    public static void roundExample(){ //round 5.49 down , round 5.5 up to INT
        double num = 5.5;
        System.out.println(Math.round(num));
    }
    public static void floorExample(){ //round down to DOUBLE
        double num = 6.99;
        System.out.println(Math.floor(num));
    }
    public static void ceilExample(){ //round up to DOUBLE
        double num = 5.01;
        System.out.println(Math.ceil(num));
    }
}
