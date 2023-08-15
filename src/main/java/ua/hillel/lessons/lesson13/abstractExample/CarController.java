package ua.hillel.lessons.lesson13.abstractExample;

public class CarController {
    public void aboutCar(Car car){
        car.brake();
        car.drive();
        car.brake();
    }
}
