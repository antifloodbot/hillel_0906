package ua.hillel.lessons.lesson13.abstractExample;

public abstract class Car {
    abstract String maxSpeed();
    abstract void drive();
    abstract void brake();
    abstract void repair();
    void countWheels(){
        System.out.println("4");
    }
}
