package ua.hillel.lessons.lesson14.initializationblock;

public class Launch {
    public static void main(String[] args) {
        Dog dog = new Dog("barsik", "shpitz", 10);
        Dog dog1 = new Dog();
        System.out.println(dog.getAge());
        System.out.println(dog.getBread());
        System.out.println(dog.getName());

        System.out.println(dog1.getAge());
        System.out.println(dog1.getBread());
        System.out.println(dog1.getName());
    }
}
