package ua.hillel.lessons.lesson8.oop;

import ua.hillel.lessons.lesson8.oop.inheritance.Lion;

import java.util.Scanner;

public class Oop extends Cat{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //scanner.next();
        Cat cat = new Cat();
        cat.sayHello();
        System.out.println(color);
        Lion lion = new Lion();
        lion.walk();
    }
}
