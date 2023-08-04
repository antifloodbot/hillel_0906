package ua.hillel.lessons.lesson15.exeptions;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SimpleExceptionExample {
    public static void main(String[] args) {
        exceptionExample3();

    }

    static void exceptionExample() {
        try{
            FileWriter fileWriter = new FileWriter("text.txt");
            fileWriter.close();
          //  fileWriter.write("Hello");
        } catch (IOException u){
            System.out.println("Please open stream");
            u.printStackTrace();
        } finally {
            System.out.println("Finally block is executed");
        }
    }

    static void structureException(){
        try{
            System.out.println(5 / 0);
        } catch (ArithmeticException e){
            System.out.println("no no");
        }
        System.out.println("continue");
    }

    static void exceptionExample2(){
        System.out.println("enter value:");
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int[] a = {3, 4, 6};

        try{
            System.out.println(a[b] / 0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Unknown array index");
        } catch (ArithmeticException e){
            System.out.println("Division on null");
        }
    }

    static void exceptionExample3(){
        System.out.println("enter value:");
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int[] a = {3, 4, 6};

        try{
            System.out.println(a[b] / 0);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Something bad happened");
        }
    }
}