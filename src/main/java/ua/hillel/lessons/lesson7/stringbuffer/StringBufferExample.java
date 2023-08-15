package ua.hillel.lessons.lesson7.stringbuffer;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        StringBuffer sb1 = new StringBuffer("Hello world");
        System.out.println(sb1);
        sb.append(false);
        sb.append(Arrays.asList(3,5,6));
        sb.append(": ");
        sb.append('\n');
        sb.append(": ");
        System.out.println(sb);

        stringBufferMethods();
    }
    public static void stringBufferMethods(){
        String numbers = "0123456789";
        StringBuffer stringBuffer = new StringBuffer(numbers);

        System.out.println(stringBuffer.substring(3));
        System.out.println(stringBuffer.substring(4,8));
        System.out.println(stringBuffer.replace(1,5, "OLOLOSHA"));
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuffer.delete(5,9));
        System.out.println(stringBuffer.deleteCharAt(5));
        System.out.println(stringBuffer.insert(1, "ABC"));
    }
}
