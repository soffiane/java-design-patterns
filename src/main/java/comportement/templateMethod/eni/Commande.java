package comportement.templateMethod.eni;

public abstract class Commande {
    private double montantHt;
    private double montantTva;
    private double montantTtc;

    protected abstract void calculeTva();

    public void calculeMontantTtc(){
        //partie du traitement delegué aux sous classes
        this.calculeTva();
        //traitement commun a toutes les classes
        montantTtc = montantHt + montantTva;
    }

    public void setMontantHt(double montantHt){
        this.montantHt = montantHt;
    }

    public void affiche(){
        System.out.println("Commande");
        System.out.println("Montant HT : "+montantHt);
        System.out.println("Montant TTC : "+montantTtc);
    }

    public void setMontantTva(double montantTva) {
        this.montantTva = montantTva;
    }

    public double getMontantHt() {
        return montantHt;
    }
}
