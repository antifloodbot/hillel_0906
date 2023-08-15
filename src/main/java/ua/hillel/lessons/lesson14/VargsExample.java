package ua.hillel.lessons.lesson14;

public class VargsExample {
    public static void main(String[] args) {
        String names = namesHandler("Alex ", "Kostia ", "Oleg");
        System.out.println(names);

        String names2 = namesHandler("Ololo ", "Petro ", "Ivan ", "John");
        System.out.println(names2);
    }
    static String namesHandler(String... name){
        String str = null;
        for (String n : name){
            str += n.toUpperCase();
        }
        return str;
    }

    static String namesHandler(String name1, String name2, String name3){
        return name1.toUpperCase() + name2.toUpperCase() + name3.toUpperCase();
    }
}
