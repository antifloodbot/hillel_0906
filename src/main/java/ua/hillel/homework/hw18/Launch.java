package ua.hillel.homework.hw18;

public class Launch {
    public static void main(String[] args) {

        Client clientLegalEntity = new LegalEntities();
        clientLegalEntity.showDetailAccountInfo();
        clientLegalEntity.withdraw(100);
        clientLegalEntity.showUserBalance();

        Client clientIndividual = new Individuals();
        clientIndividual.withdraw(10);
        clientIndividual.showUserBalance();
        clientIndividual.withdraw(0);
        clientIndividual.deposit(0);
    }
}
