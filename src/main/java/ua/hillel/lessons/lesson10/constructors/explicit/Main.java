package ua.hillel.lessons.lesson10.constructors.explicit;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Cat", "33");
        animal.sayName();
        animal.sayAge();

        Animal animal1 = new Animal();
        animal1.sayHello();
    }
}
