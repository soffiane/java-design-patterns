package comportement.state.eni;

public class CommandeValidee extends EtatCommande {
    public CommandeValidee(Commande commande) {
        super(commande);
    }

    @Override
    public void ajouteProduit(Produit produit) {

    }

    @Override
    public void retireProduit(Produit produit) {

    }

    /**
     * Dans cet etat,on ne peut que supprimer la commande
     */
    @Override
    public void efface() {
        getCommande().getProduits().clear();
    }

    /**
    * si on valide la commande, on passe à livrée
     */
    @Override
    public EtatCommande etatSuivant() {
        return new CommandeLivree(getCommande());
    }
}
