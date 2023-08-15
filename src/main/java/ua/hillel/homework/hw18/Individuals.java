package ua.hillel.homework.hw18;

public class Individuals extends Client{

    @Override
    public void deposit(double amount){
        if (amount <= 0) {
            System.out.println("Cannot deposit " + amount + "$.");
        } else {
            userBalance += amount;
            System.out.println(userBalance + "$ deposited to the balance.");
        }
    }

    @Override
    public void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Cannot withdraw " + amount + "$.");
        } else if (userBalance >= amount){
            userBalance -= amount;
            System.out.println(userBalance + "$ withdrawn from the balance.");
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
