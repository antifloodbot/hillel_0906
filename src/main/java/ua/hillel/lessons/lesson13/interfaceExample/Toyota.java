package ua.hillel.lessons.lesson13.interfaceExample;

public class Toyota implements Car{
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
        System.out.println("4 places ");
    }

    @Override
    public void pricePerKillometer() {
        System.out.println("price per kilometr 10$ ");
    }
}
