package ua.hillel.homework.hw18;

public class LegalEntities extends Client{
    @Override
    public void deposit(double amount){
        userBalance += amount;
        System.out.println(userBalance + "$ deposited to the balance.");
    }
    @Override
    public void withdraw(double amount){
        double commission = amount * 0.01;
        userBalance -= (amount + commission);
        System.out.println(amount + commission + "$ withdrawn from the balance. Your commission is " + commission + "$.");
    }

    @Override
    public void showDetailAccountInfo(){
        showUserBalance();
        System.out.println("Deposit is processed without a commission.");
        System.out.println("Withdraw is processed with 1% commission.");
    }
}
