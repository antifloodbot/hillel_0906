package ua.hillel.lessons.lesson13.interfaceExample;

public interface Car {
    static final String name = "Maks";
    void getPassenger();
    void passengerPay();
    void passengerPlaces();
    void pricePerKillometer();
    default void countWheels(){
        System.out.println("4");
    }
}
