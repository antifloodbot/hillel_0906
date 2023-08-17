package ua.hillel.homework.hw18;

public abstract class Client {

    protected double userBalance = 0.0;

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Cannot deposit " + amount + "$.");
        } else {
            userBalance += amount;
            System.out.println(amount + "$ deposited to the balance.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Cannot withdraw " + amount + "$.");
        } else if (amount > userBalance) {
            System.out.println("Cannot withdraw " + amount + "$. Insufficient balance.");
        } else {
            userBalance -= amount;
            System.out.println(amount + "$ withdrawn from the balance.");
        }
    }

    public void showUserBalance() {
        System.out.println("Current user balance is " + userBalance + "$.");
    }

    public abstract void showDetailAccountInfo();
}