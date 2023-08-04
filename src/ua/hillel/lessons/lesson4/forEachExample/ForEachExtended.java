package ua.hillel.lessons.lesson4.forEachExample;

public class ForEachExtended {
    public static void main(String[] args) {
        // ініціалізація одновимірного масиву A
        int[] A = {1, 8, 3, 6, 5, 10, 31, 24, 10, 13, 2, 4};
        int k = 0; // кількість парних чисел
// розширений цикл for
        for (int d : A)
            if (d % 2 == 0)
                k++; // k = 7
    }
}
