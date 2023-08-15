package ua.hillel.homework.hw18;

public class LegalEntities extends Client{
    @Override
    public void deposit(double amount){
        balance += amount;
        System.out.println(balance + "$ deposited to the balance.");
    }
    @Override
    public void withdraw(double amount){
        double commission = amount * 0.01;
        balance -= (amount + commission);
        System.out.println(balance + "$ withdrawn from the balance.");
    }

    @Override
    public void showDetailAccountInfo(){
        showUserBalance();
        System.out.println("Deposit is processed without a commission.");
        System.out.println("Withdraw is processed with 1% commission.");
    };
}
