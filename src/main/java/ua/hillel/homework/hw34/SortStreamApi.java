package ua.hillel.homework.hw34;

public class SortStreamApi {
    public static void main(String[] args) {
        String eng = "ealgbkjdfvbjkhfdkbljvd";
        sortAndPrint(eng);
    }

    public static void sortAndPrint(String str) {
        str.chars()
                .sorted()
                .forEach(ch -> System.out.print((char) ch));
    }
}