package ua.hillel.lessons.lesson13.interfaceExample;

public class TaxiController {
    public void aboutTaxiCar(Car car){
        System.out.println("in this car ");
        car.getPassenger();
        car.passengerPlaces();
        car.pricePerKillometer();
        car.passengerPay();
        car.countWheels();
    }
}
