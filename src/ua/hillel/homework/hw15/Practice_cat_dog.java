package ua.hillel.homework.hw15;

import java.util.ArrayList;
import java.util.List;

public class Practice_cat_dog {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog("Tuzik"));
        animals.add(new Cat("Vasya"));

        for (Animal animal : animals){
            animal.sound();
        }
    }
}
