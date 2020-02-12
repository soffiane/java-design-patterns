package comportement.templateMethod.eni;

public class CommandeFrance extends Commande {
    @Override
    protected void calculeTva() {
        setMontantTva(getMontantHt() * 0.196);
    }
}
