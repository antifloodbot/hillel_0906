package ua.hillel.homework.hw18;

public class Launch {
    public static void main(String[] args) {

        Client clientLegalEntity = new LegalEntities();
        clientLegalEntity.deposit(1000);
        clientLegalEntity.showUserBalance();
        clientLegalEntity.withdraw(100);
        clientLegalEntity.showUserBalance();
    }
}
