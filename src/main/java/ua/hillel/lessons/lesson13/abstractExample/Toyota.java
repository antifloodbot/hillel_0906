package ua.hillel.lessons.lesson13.abstractExample;

public class Toyota extends Car {
    @Override
    String maxSpeed() {
        return "500";
    }

    @Override
    void drive() {
        System.out.println("Toyota drive");
    }

    @Override
    void brake() {
        System.out.println("Toyota brake");
    }

    @Override
    void repair() {
        System.out.println("Toyota repair");
    }
}
