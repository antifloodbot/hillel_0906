package ua.hillel.lessons.lesson9.polimorphysm.overload;

public class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Overrided Dog");
        aboutDog();
    }
    public void aboutDog() {
        System.out.println("Bim");
    }
}
