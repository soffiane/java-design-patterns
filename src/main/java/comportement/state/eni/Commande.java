package comportement.state.eni;

import java.util.ArrayList;
import java.util.List;

public class Commande {
    private List<Produit> produits = new ArrayList<>();
    private EtatCommande etatCommande;

    public Commande() {
        this.etatCommande = new CommandeEnCours(this);
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void ajouteProduit(Produit produit){
        etatCommande.ajouteProduit(produit);
    }

    public void retireProduit(Produit produit){
        etatCommande.retireProduit(produit);
    }

    public void efface(){
        etatCommande.efface();
    }

    /**
     * Cette methode gere le passage d'un etat à un autre
     * et du coup d'un objet a un autre
     */
    public void etatSuivant(){
        etatCommande = etatCommande.etatSuivant();
        System.out.println("Etat de la commande : "+etatCommande);
    }

    public void affiche(){
        System.out.println("Contenu de la commande");
        produits.forEach(Produit::affiche);
    }
}
