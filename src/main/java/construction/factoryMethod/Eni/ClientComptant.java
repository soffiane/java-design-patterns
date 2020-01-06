package construction.factoryMethod.Eni;

public class ClientComptant extends Client {
    @Override
    protected Commande creeCommande(double montant) {
        return new CommandeComptant(montant);
    }
}
