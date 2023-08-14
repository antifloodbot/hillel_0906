package ua.hillel.homework.hw16;

public class Bicycle implements Vehicle {
    private String company;
    private String model;
    private int year;
    private int pedals;

    public Bicycle(String company, String model, int year, int pedals) {
        this.company = company;
        this.model = model;
        this.year = year;
        this.pedals = pedals;
    }
    @Override
    public void start(){
        System.out.println("Поездка а велосипеде " + company + " началась. У велосипеда " + pedals + " педали.");
    }

    @Override
    public void stop(){
        System.out.println("Поездка на велосипеде " + company + " завершена.");
    }
}
