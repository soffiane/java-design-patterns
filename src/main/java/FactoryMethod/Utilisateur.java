package FactoryMethod;

public class Utilisateur {

    public static void main(String... args){
        Client client;
        client = new ClientComptant();
        client.nouvelleCommande(2000.0);
        client.nouvelleCommande(10000.0);
        client.getCommandes().forEach(System.out::println);
        client = new ClientCredit();
        client.nouvelleCommande(2000.0);
        client.nouvelleCommande(10000.0);
        client.getCommandes().forEach(System.out::println);
    }
}
