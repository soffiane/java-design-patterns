package FactoryMethod;

public class ClientCredit extends Client {
    @Override
    protected Commande creeCommande(double montant) {
        return new CommandeCredit(montant);
    }
}
