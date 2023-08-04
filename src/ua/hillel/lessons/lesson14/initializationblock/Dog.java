package ua.hillel.lessons.lesson14.initializationblock;

public class Dog {
    private String name;
    private String bread;
    private int age;

    public Dog(String name, String bread, int age) {
        this.name = name;
        this.bread = bread;
        this.age = age;
    }
    {
        name = "Rex";
        bread = "Putin";
        age = 88;
    }

    public String getName() {
        return name;
    }

    public String getBread() {
        return bread;
    }

    public int getAge() {
        return age;
    }

    public Dog(){
    }
}

