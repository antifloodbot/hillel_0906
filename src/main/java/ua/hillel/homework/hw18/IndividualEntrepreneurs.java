package ua.hillel.homework.hw18;

public class IndividualEntrepreneurs extends Client {

    @Override
    public void deposit(double amount) {
        double commissionRate = amount < 1000 ? 0.01 : 0.005;
        if (amount <= 0) {
            System.out.println("Cannot deposit " + amount + "$.");
        } else {
            double commission = amount * commissionRate;
            userBalance += (amount - commission);
            System.out.println(amount - commission + "$ deposited to the balance. Your commission is " + commission + "$.");
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
        System.out.println("Deposit is processed with 1% commission if deposit amount is less than 1000.0$. If deposit amount is 1000.0$ or bigger commission is 0.5%");
        System.out.println("Withdraw is processed without a commission.");
        showUserBalance();
    }
}