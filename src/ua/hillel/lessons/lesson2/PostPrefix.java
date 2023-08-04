package ua.hillel.lessons.lesson2;

public class PostPrefix {
    public static void main(String[] args) {
        int n = 2;
        int k = 2;
        int a = 2 * n++; /** first multiply and then increase n for 1*/
        System.out.println(a);
        System.out.println(n);

        int b = 2 * ++k; /** first k + 1 then  multiply 2 for k*/
        System.out.println(b);
        /** */

        int x = 5;
        int y = 0;

// Префиксный инкремент
        y = ++x;  // сначала увеличивается x, затем y присваивается новое значение x
        System.out.println("Префиксный инкремент: x = " + x + ", y = " + y);  // x = 6, y = 6

        x = 5;
        y = 0;

// Постфиксный инкремент
        y = x++;  // y присваивается текущее значение x, затем x увеличивается
        System.out.println("Постфиксный инкремент: x = " + x + ", y = " + y);  // x = 6, y = 5

    }
}
