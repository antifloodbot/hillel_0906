package ua.hillel.lessons.lesson13.interfaceExample;

public class Bmw implements Car{
    @Override
    public void getPassenger() {
        System.out.println("get passenger ");
    }

    @Override
    public void passengerPay() {
        System.out.println("passenger pay ");
    }

    @Override
    public void passengerPlaces() {
        System.out.println("2 places ");
    }

    @Override
    public void pricePerKillometer() {
        System.out.println("price per kilometr 20$ ");
    }

    public void countWheels() {
        Car.super.countWheels();
    }
}
