package comportement.state.eni;

public abstract class EtatCommande {
    private Commande commande;

    public EtatCommande(Commande commande) {
        this.commande = commande;
    }

    public Commande getCommande() {
        return commande;
    }

    public abstract void ajouteProduit(Produit produit);
    public abstract void retireProduit(Produit produit);
    public abstract void efface();
    public abstract EtatCommande etatSuivant();
}
