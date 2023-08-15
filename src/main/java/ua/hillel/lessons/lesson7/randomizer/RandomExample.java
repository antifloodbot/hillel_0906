package ua.hillel.lessons.lesson7.randomizer;

public class RandomExample {

    /** (Math.random() * (b-a) ) + a
     * [0;3)
     * */

    public static void main(String[] args) {
        double a = Math.random() * 3;
        System.out.println(a);

        double b = Math.random() + 2;
        System.out.println(b);
        //[0;2]

        int c = (int) (Math.random() * 3);
        System.out.println(c);
    }
}
