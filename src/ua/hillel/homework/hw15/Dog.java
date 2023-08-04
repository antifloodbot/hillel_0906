package ua.hillel.homework.hw15;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("I'am a Doc. My name is " + name + ". Gav");
    }
}
