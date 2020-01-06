package AbstractFactory.Eni;

public class ScooterElectrique extends Scooter {

    public ScooterElectrique(String modele, String couleur, int puissance) {
        super(modele, couleur, puissance);
    }

    public void afficheCaracteristiques() {
        System.out.println("ScooterElectrique{ " + super.toString()+" }");
    }
}
