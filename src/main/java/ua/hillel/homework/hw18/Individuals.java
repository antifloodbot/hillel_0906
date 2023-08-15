package ua.hillel.homework.hw18;

public class Individuals extends Client{

    @Override
    public void deposit(double amount){
        if (amount <= 0) {
            System.out.println("Cannot deposit " + amount + "$.");
        } else {
            balance += amount;
            System.out.println(balance + "$ deposited to the balance.");
        }
    }

    @Override
    public void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Cannot withdraw " + amount + "$.");
        } else if (balance >= amount){
            balance -= amount;
            System.out.println(balance + "$ withdrawn from the balance.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    @Override
    public void showDetailAccountInfo(){
        showUserBalance();
        System.out.println("Deposit and withdrawal are processed without a commission.");
    };
}
