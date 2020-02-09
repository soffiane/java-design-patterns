package comportement.state.eni;

public class CommandeEnCours extends EtatCommande {
    public CommandeEnCours(Commande commande) {
        super(commande);
    }

    @Override
    public void ajouteProduit(Produit produit) {
        getCommande().getProduits().add(produit);
    }

    @Override
    public void retireProduit(Produit produit) {
        getCommande().getProduits().remove(produit);
    }

    @Override
    public void efface() {
        getCommande().getProduits().clear();
    }

    @Override
    public EtatCommande etatSuivant() {
        return new CommandeValidee(getCommande());
    }

}
