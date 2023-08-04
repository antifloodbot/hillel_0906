package ua.hillel.lessons.lesson4;

public class ArrayExample {
    public static void main(String[] args) {

        int [] arrayInt = {1,2,3,4};
        String[] arrayStr = {"Alex", "Igor", "Kosta"};

        int arrayLengthInt = arrayInt.length;
        int arrayLengthString = arrayStr.length;

        //System.out.println(arrayLengthInt);
        //System.out.println(arrayLengthString);

        //System.out.println(arrayStr[2]);
        //System.out.println(arrayInt[3]);

        int [] array1 = new int[3];
        array1[0] = 10;
        array1[1] = 20;
        array1[2] = 30;
        System.out.println(array1[0]);

        int[] ints = new int[3];
        System.out.println("Default value for int is: " + ints[0]);

        String[] strings = new String[2];
        System.out.println("Default value for String is: " + strings[0]);

        boolean[] booleans = new boolean[2];
        System.out.println("Default value for boolean is: " + booleans[0]);

        double[] doubles = new double[2];
        System.out.println("Default value for double is: " + doubles[1]);

        char[] chars = new char[4];
        System.out.println("Default value for char is: " + chars[0]);

        float[] floats = new float[3];
        System.out.println("Default value for float is: " + floats[2]);

        byte[] bytes = new byte[1];
        System.out.println("Default value for byte is: " + bytes[0]);

        long[] longs = new long[2];
        System.out.println("Default value for long is: " + longs[0]);
    }
}
