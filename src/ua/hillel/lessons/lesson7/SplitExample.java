package ua.hillel.lessons.lesson7;

public class SplitExample {
    public static void main(String[] args) {
        String str = "Hello my name is Max";
        String[] words = str.split(" ");
        System.out.println(words[2]);
        for(String w : words){
            System.out.println(w);
        }
    }
}
