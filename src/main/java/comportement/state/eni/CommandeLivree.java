package comportement.state.eni;

/**
 * Cet etat ne fait rien de special
 */
public class CommandeLivree extends EtatCommande {
    public CommandeLivree(Commande commande) {
        super(commande);
    }

    @Override
    public void ajouteProduit(Produit produit) {

    }

    @Override
    public void retireProduit(Produit produit) {

    }

    @Override
    public void efface() {

    }

    @Override
    public EtatCommande etatSuivant() {
        return this;
    }
}
