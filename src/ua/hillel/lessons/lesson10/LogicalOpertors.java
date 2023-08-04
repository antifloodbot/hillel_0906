package ua.hillel.lessons.lesson10;

public class LogicalOpertors {
    public static void main(String[] args) {
        twoOperatorAnd();
    }
    public static void twoOperatorAnd(){
        int a = 10;
        if(++a == 11 & ++a ==12){
            ++a;
        }
        System.out.println(a);
    }
    public static void oneOperatorOr(){
        int mouse = 5;
        int weight = 45;
        if(mouse == 0 | weight <100) {
            System.out.println("Feed the cat");
        }
    }
    public static void oneOperatorAnd(){
        int mouse = 5;
        int weight = 45;
        if(mouse != 0 & weight <100) {
            System.out.println("Feed the cat");
        }
    }
}
