package ua.hillel.homework.hw15;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("I'am a Cat. My name is " + getName() + ". Mew");
    }
}
