package ua.hillel.homework.hw16;

public class Main {
    public static void main(String[] args) {

        Vehicle car1 = new Car("Toyota", "Camry", 2022, 4);
        car1.start();
        car1.stop();

        Vehicle bicycle = new Bicycle("Giant", "XTC", 2021, 2);
        bicycle.start();
        bicycle.stop();
    }
}
