package AbstractFactory.Eni;

public class AutomobileElectrique extends Automobile {

    public AutomobileElectrique(String modele, String couleur, int puissance, double espace) {
        super(modele, couleur, puissance, espace);
    }

    public void afficheCaracteristiques() {
        System.out.println("AutomobileElectrique{ " + super.toString()+" }");
    }
}
