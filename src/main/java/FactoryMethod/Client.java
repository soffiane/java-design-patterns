package FactoryMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Client {

    private List<Commande> commandes = new ArrayList<>();

    protected abstract Commande creeCommande(double montant);

    public void nouvelleCommande(double montant){
        Commande commande = this.creeCommande(montant);
        if(commande.valide()){
            commande.paye();
            commandes.add(commande);
        }
    }

    public List<Commande> getCommandes() {
        return commandes;
    }
}
