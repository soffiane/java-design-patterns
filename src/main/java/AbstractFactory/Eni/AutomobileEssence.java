package AbstractFactory.Eni;

public class AutomobileEssence extends Automobile {

    public AutomobileEssence(String modele, String couleur, int puissance, double espace) {
        super(modele, couleur, puissance, espace);
    }

    public void afficheCaracteristiques() {
        System.out.println("AutomobileEssence{" + super.toString()+" }");
    }
}
