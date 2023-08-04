package ua.hillel.lessons.lesson12;

public class AboutBreak {
    public static void main(String[] args) {
        breakExample2();
    }
    public static void breakExample2(){
        for(int i = 1; i <=3; i++){
            System.out.println("This is first cycle. Runnung " + i + " times");
            for(int k = 1; k <=10; k++){
                System.out.println("This is second cycle. Running " + k + " times");
                if(k == 2)
                    break;
            }
        }
    }
    public static void breakExample1(){
        int a = 1;
        int b = 3;
        while(a <= 5){
            System.out.println(a + " итерация");
            if (a == b)
                break;
            a++;
        }
    }
}
