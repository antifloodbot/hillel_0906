package ua.hillel.lessons.lesson15.list;

import java.util.ArrayList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        methodAdd();
        methodGet();
        methodIndexOf();
        methodRemoveByObject();
        methodIndexOf();
    }
    static List<String> myArrayList;

    public static void methodAdd(){
        myArrayList = new ArrayList<>();
        myArrayList.add("Alex");
        myArrayList.add("Sergey");
        myArrayList.add(1, "Vova");

    }
    public static void  methodGet(){
        String e = myArrayList.get(1);
        System.out.println(e);

    }

    public static void  methodRemoveByIndex(){
        myArrayList.remove(1);

    }
    public static void  methodRemoveByObject(){
        myArrayList.remove("Alex");

    }
    public static void  methodIndexOf(){
        System.out.println(myArrayList.indexOf("Alex"));
        System.out.println(myArrayList.indexOf("Oleg"));

    }
    public static void  methodSet(){
        myArrayList.set(1,"Oleg");

    }

    public static void syntaxis(){
        List<String> myArrayList = new ArrayList<>();
        List<String> myLinkedList = new ArrayList<>();

    }
}
