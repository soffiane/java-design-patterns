package comportement.state.eni;

public class Utilisateur {
    public static void main(String[] args){
        Commande commande = new Commande();
        commande.ajouteProduit(new Produit("vehicule1"));
        commande.ajouteProduit(new Produit("Accessoire1"));
        commande.affiche();
        commande.etatSuivant();

        commande.ajouteProduit(new Produit("Accessoire 3"));
        commande.efface();
        commande.affiche();

        Commande commande2 = new Commande();
        commande2.ajouteProduit(new Produit("vehicule2"));
        commande2.ajouteProduit(new Produit("Accessoire4"));
        commande2.affiche();
        commande2.etatSuivant();
        commande2.affiche();
        commande2.etatSuivant();
        commande2.efface();
        commande2.affiche();
    }
}
