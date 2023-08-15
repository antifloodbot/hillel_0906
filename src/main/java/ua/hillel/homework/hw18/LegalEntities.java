package ua.hillel.homework.hw18;

public class LegalEntities extends Client {

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
        double commission = amount * 0.01;
        if (amount + commission > userBalance) {
            System.out.println("Cannot withdraw " + amount + "$. Insufficient balance.");
        } else if (amount <= 0) {
            System.out.println("Cannot withdraw " + amount + "$.");
        } else {
            userBalance -= (amount + commission);
            System.out.println(amount + "$ withdrawn from the balance. Your commission is " + commission + "$.");
        }
    }

    @Override
    public void showDetailAccountInfo() {
        System.out.println("Deposit is processed without a commission.");
        System.out.println("Withdraw is processed with 1% commission.");
        showUserBalance();
    }
}