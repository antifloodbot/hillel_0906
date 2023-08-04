package ua.hillel.lessons.lesson13.abstractExample;

public class Honda extends Car{
    @Override
    String maxSpeed() {
        return "300";
    }

    @Override
    void drive() {
        System.out.println("Honda drive");
    }

    @Override
    void brake() {
        System.out.println("Honda brake");
    }

    @Override
    void repair() {
        System.out.println("Honda repair");
    }
}
