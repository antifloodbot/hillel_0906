package ua.hillel.lessons.lesson16.set;

import java.util.HashSet;

public class SetExample {
    static HashSet<Integer> myHashSet = new HashSet<>();

    public static void main(String[] args) {
        addMethod();
        sizeMethod();
        isEmptyMethod();
        clearMethod();
        sizeMethod();
        isEmptyMethod();
    }

    static void isEmptyMethod(){
        System.out.println("Does my hashset is empty: " + myHashSet.isEmpty());    }

    static void clearMethod(){
        myHashSet.clear();
    }

    static void sizeMethod(){
        System.out.println("myHashset size: " + myHashSet.size());
    }

    static void isContainsMethod() {
        System.out.println("Does my hashset contains: " + myHashSet.contains(1));
        System.out.println("Does my hashset contains: " + myHashSet.contains(100));
    }

    static void removeMethod() {
        System.out.println("Before removing");
        for (int i : myHashSet) {
            System.out.print(i + " ");
        }
        myHashSet.remove(1);

        System.out.println("After removing");
        for (int i : myHashSet) {
            System.out.print(i + " ");
        }
    }

    static void addMethod() {
        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(2);
        myHashSet.add(3);
        for (int i : myHashSet) {
            System.out.println(i);
        }
    }
}
