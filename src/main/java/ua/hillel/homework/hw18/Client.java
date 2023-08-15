package ua.hillel.homework.hw18;

public abstract class Client {

    protected double balance = 0.0;

    public double getBalance(){
        return balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public void showUserBalance(){
        System.out.println("Current user balance is: " + balance +"$.");
    }
    public abstract void showDetailAccountInfo();
}