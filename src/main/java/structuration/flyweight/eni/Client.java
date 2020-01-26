package structuration.flyweight.eni;

public class Client {
    public static void main(String[] args){
        FabriqueOption fabriqueOption = new FabriqueOption();
        VehiculeCommande vehiculeCommande = new VehiculeCommande();
        vehiculeCommande.ajouteOption("air bag",80,fabriqueOption);
        vehiculeCommande.ajouteOption("direction assistee",90,fabriqueOption);
        vehiculeCommande.ajouteOption("vitres electriques",85,fabriqueOption);
        vehiculeCommande.afficheOptions();
    }
}
