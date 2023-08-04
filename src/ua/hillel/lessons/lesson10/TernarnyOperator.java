package ua.hillel.lessons.lesson10;

public class TernarnyOperator {
    public static void main(String[] args) {
        conditionTernarny("Hodor");
        conditionTernarny("Hodor!");
        example();
    }
    public static void conditionTernarny(String str){
        var lastChar  = str.charAt(str.length() - 1);
        String result = lastChar == '!' ? "question" : "no question";
        System.out.println(result);
    }
    public static void conditionSimple(String str){
        var lastChar  = str.charAt(str.length() - 1);
        if (lastChar == '?'){
            System.out.println("question");
        } else {
            System.out.println("no question");
        }
    }
    public static void example(){
        int x = 10;
        int y = 5;
        int max = (x > y) ? x : y;
        System.out.println(max);
    }
}
