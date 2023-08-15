package ua.hillel.homework.hw18;

public abstract class Client {
    private int balance = 0;

    public abstract void deposit();

    public abstract void withdraw();

    public void showUserBalance(){
        System.out.println("Current user balance is: " + balance);
    }
    public abstract void showDetailAccountInfo();
}
