package ua.hillel.homework.hw16;

public class Car implements Vehicle{
    private String company;
    private String model;
    private int year;
    private int doors;

    public Car(String company, String model, int year, int doors) {
        this.company = company;
        this.model = model;
        this.year = year;
        this.doors = doors;
    }

    @Override
    public void start() {
        System.out.println("Двигатель автомобиля " + company + " запущен. У авто " + doors + " двери!");
    }

    @Override
    public void stop() {
        System.out.println("Двигатель автомобиля " + company + " остановлен.");
    }
}
