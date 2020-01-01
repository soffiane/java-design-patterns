package AbstractFactory;

public class ScooterEssence extends Scooter {

    public ScooterEssence(String modele, String couleur, int puissance) {
        super(modele, couleur, puissance);
    }

    public void afficheCaracteristiques() {
        System.out.println("ScooterEssence{ " + super.toString()+" }");
    }
}
