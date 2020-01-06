package FactoryMethod.Eni;

public class CommandeCredit extends Commande {

    public CommandeCredit(double montant) {
        super(montant);
    }

    @Override
    public boolean valide() {
        return getMontant() >= 1000.0 && getMontant() < 5000.0;
    }

    @Override
    public void paye() {
        System.out.println("Le paiement de la commande en credit de : " + getMontant() + " est effectué.");
    }
}
