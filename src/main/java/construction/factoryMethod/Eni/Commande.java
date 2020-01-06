package construction.factoryMethod.Eni;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public abstract class Commande {

    private double montant;

    public Commande(double montant) {
        this.montant = montant;
    }

    public abstract boolean valide();
    public abstract void paye();

}
