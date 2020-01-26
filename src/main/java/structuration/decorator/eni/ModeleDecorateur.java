package structuration.decorator.eni;

public class ModeleDecorateur extends Decorateur {
    public ModeleDecorateur(ComposantGraphiqueVehicule composantGraphiqueVehicule) {
        super(composantGraphiqueVehicule);
    }

    private void afficheInfosTechniques(){
        System.out.println("Informations techniques du modele");
    }

    //intercepte la methode affiche et fait les traitement supplementaires
    public void affiche() {
        super.affiche();
        this.afficheInfosTechniques();
    }
}
