package ua.hillel.homework.hw34;

public class SortStreamApi {

    public static void main(String[] args) {
        SortStreamApi sorter = new SortStreamApi();
        String eng = "ealgbkjdfvbjkhfdkbljvd";
        sorter.sortAndPrint(eng);
    }

    public void sortAndPrint(String str) {
        str.chars()
                .mapToObj(c -> (char) c)
                .sorted()
                .forEach(System.out::print);
    }
}