package ua.hillel.lessons.lesson5.methods;

public class MethodsStr {
    public static void main(String[] args) {
        stringReplace();
    }

    public static void stringLength() {
        String str = "Hello    world";
        System.out.println(str.length());
    }

    public static void stringTrim() {
        String str = "            Hello    ";
        System.out.println(str.trim());
    }

    public static void stringConcat() {
        String str = "Hello ";
        String str2 = "Max";
        String result = str.concat(str2);
        System.out.println(result);
    }

    public static void stringEndsWith() {
        String str = "Hello world";
        boolean end1 = str.endsWith("world");
        boolean end2 = str.endsWith("Alex");
        System.out.println(end1);
        System.out.println(end2);
    }

    public static void stringToUpperCase() {
        String str = "Hello world".toUpperCase();
        System.out.println(str);
    }
    public static void stringToLowerCase() {
        String str = "Hello WOrLd".toLowerCase();
        System.out.println(str);
    }

    public static void stringEquals(String str, String str2) {
        if (str.equals(str2)) {
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }
    }

    public static void stringContains() {
        String str = "Hello";
        if (str.contains("Hello")) {
            System.out.println("contains");
        } else {
            System.out.println("not contains");
        }
    }
    public static void stringCharAt(){
        String str = "Hello world";
        char returnedChar = str.charAt(5);
        System.out.println(returnedChar);
    }
    public static void stringIndexOf(){
        String str = "Hello world";
        System.out.println(str.lastIndexOf("o"));
        System.out.println(str.indexOf("o"));
    }
    public static void stringSubstring(){
        String str = "Hello world";
        System.out.println(str.substring(4,7));
    }
    public static void stringReplace(){
        String str = "Hello world";
        String str2 = str.replace("Hello world", "bob");
        System.out.println(str2);
    }
    public static void toCharArray(){
        String text = "Hello, I am Maks";
        char[] result = text.toCharArray();
        for(int i = 0; i < result.length; i++){
            System.out.println("Element [" + i + "]: " + result[i]);
        }
    }
    public static void copyValueOf(){
        char[] chars = {'H', 'i'};
        String text = null;
        text = text.copyValueOf(chars);
        System.out.println(text);
    }
}
