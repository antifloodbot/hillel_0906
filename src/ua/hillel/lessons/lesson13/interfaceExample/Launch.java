package ua.hillel.lessons.lesson13.interfaceExample;

public class Launch {
    public static void main(String[] args) {
        Bmw bmw = new Bmw();
        TaxiController taxiController = new TaxiController();
        taxiController.aboutTaxiCar(bmw);
    }
}
