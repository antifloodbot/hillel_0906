package ua.hillel.lessons.lesson9.polimorphysm.overload;

public class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Meo");
        aboutCat();
    }
    public void aboutCat(){
        System.out.println("Murka");
    }
}
