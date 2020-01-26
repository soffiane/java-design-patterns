package structuration.decorator.eni;

public class MarqueDecorateur extends Decorateur {
    public MarqueDecorateur(ComposantGraphiqueVehicule composantGraphiqueVehicule) {
        super(composantGraphiqueVehicule);
    }

    private void afficheLogo() {
        System.out.println("Logo de la marque");
    }

    //intercepte la methode affiche et fait les traitement supplementaires
    public void affiche() {
        super.affiche();
        this.afficheLogo();
    }
}
