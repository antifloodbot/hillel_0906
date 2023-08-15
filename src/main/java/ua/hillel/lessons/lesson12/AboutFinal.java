package ua.hillel.lessons.lesson12;

public class AboutFinal {
    public static void main(String[] args) {
        finalExample();
    }
    public static void finalExample(){
        final int NUMBER = 5;
        System.out.println(NUMBER);
    }
    final void sayAge(){
        System.out.println("5");
    }
}
