package ua.hillel.homework.hw18;

public class Individuals extends Client {

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Cannot deposit " + amount + "$.");
        } else {
            userBalance += amount;
            System.out.println(amount + "$ deposited to the balance.");
        }
    }

    @Override
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

    @Override
    public void showDetailAccountInfo() {
        System.out.println("Deposit and withdrawal are processed without a commission.");
        showUserBalance();
    }
}