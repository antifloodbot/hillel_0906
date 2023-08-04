package ua.hillel.lessons.lesson9.polimorphysm.overload;

public class Start {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();

        Cat cat = new Cat();
        cat.sound();

        Dog dog = new Dog();
        dog.sound();

        Cow cow = new Cow();
        cow.sound();
    }
}
