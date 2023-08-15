package ua.hillel.lessons.lesson9.polimorphysm.overload;

public class Cow extends Animal{
    @Override
    public void sound(){
        System.out.println("Muu");
        aboutCow();
    }

    public void aboutCow() {
        System.out.println("Burenka");
    }
}
