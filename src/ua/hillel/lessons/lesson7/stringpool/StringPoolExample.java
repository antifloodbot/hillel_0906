package ua.hillel.lessons.lesson7.stringpool;

public class StringPoolExample {
    public static void main(String[] args) {
        String str1 = "Alex";
        String str2 = "Alex";
        String str3 = new String("Ololo");
        String str4 = new String("Ololo");
        System.out.println(str1 == str2);
        System.out.println(str3 == str4);

        String str5 = "    JAVA     ".toLowerCase().trim();
        str5 = "lol";
        System.out.println(str5);
    }
}
