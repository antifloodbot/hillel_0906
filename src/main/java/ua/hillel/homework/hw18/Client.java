package ua.hillel.homework.hw18;

public abstract class Client {

    protected double userBalance = 0.0;

    public double getBalance() {
        return userBalance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public void showUserBalance() {
        System.out.println("Current user balance is " + userBalance + "$.");
    }

    public abstract void showDetailAccountInfo();
}