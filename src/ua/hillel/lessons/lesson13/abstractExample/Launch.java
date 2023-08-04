package ua.hillel.lessons.lesson13.abstractExample;

import ua.hillel.lessons.lesson12.Cat;

public class Launch {
    public static void main(String[] args) {
        CarController carController = new CarController();
        Honda honda = new Honda();
        carController.aboutCar(honda);
    }
}
