package ua.hillel.homework.hw18;

public abstract class Client {

    private double userBalance;

    public Client(double userBalance){
        this.userBalance = userBalance;
    }
    public double getUserBalance() {
        return userBalance;
    }

    public void setUserBalance(double balance) {
        this.userBalance = balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public void showUserBalance() {
        System.out.println("Current user balance is " + userBalance + "$.");
    }

    public abstract void showDetailAccountInfo();
}