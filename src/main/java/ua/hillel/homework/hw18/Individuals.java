package ua.hillel.homework.hw18;

public class Individuals extends Client {

    @Override
    public void showDetailAccountInfo() {
        System.out.println("Deposit and withdrawal are processed without a commission.");
        showUserBalance();
    }
}