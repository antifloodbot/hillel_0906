package ua.hillel.lessons.lesson10.constructors.explicit;

public class Animal {
    private String name;
    private String age;

    public Animal(String name, String age){
        this.name = name;
        this.age = age;
    }
    public Animal(){

    }

    void sayName(){
        System.out.println(this.name);
    }
    void sayAge(){
        System.out.println(this.age);
    }
    void sayHello(){
        System.out.println("helllo");
    }
}
