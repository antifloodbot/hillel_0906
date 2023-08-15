package ua.hillel.homework.hw18;

public class Launch {
    public static void main(String[] args) {
        Client clientIndividual = new Individuals();
        clientIndividual.deposit(100);
        clientIndividual.withdraw(10);
        clientIndividual.showUserBalance();
        clientIndividual.showDetailAccountInfo();

        Client clientLegalEntity = new LegalEntities();
        clientLegalEntity.deposit(100);
        clientLegalEntity.withdraw(10);
        clientLegalEntity.showUserBalance();
        clientLegalEntity.showDetailAccountInfo();

        Client clientIndividualEntrepreneur = new IndividualEntrepreneurs();
        clientIndividualEntrepreneur.deposit(999);
        clientIndividualEntrepreneur.deposit(1000);
        clientIndividual.withdraw(50);
        clientIndividualEntrepreneur.showUserBalance();
        clientIndividualEntrepreneur.showDetailAccountInfo();
    }
}