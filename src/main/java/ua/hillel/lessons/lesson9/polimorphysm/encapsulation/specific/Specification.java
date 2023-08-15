package ua.hillel.lessons.lesson9.polimorphysm.encapsulation.specific;

public class Specification {
    private  String fuel = "Petrol";
    public String setFuel(String fuel){
        this.fuel = fuel;
        return fuel;
    }

    private static void color(){
        System.out.println("Red");
    }
}
