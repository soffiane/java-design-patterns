package comportement.iterator.eni;

/**
 * Vehicule est une implementation d'Element et est un element du catalogue
 */
public class Vehicule extends Element {

    public Vehicule(String description) {
        super(description);
    }

    public void affiche(){
        System.out.println("Description du vehicule : "+getDescription());
    }
}
