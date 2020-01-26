package structuration.decorator.eni;

public class VueVehicule implements ComposantGraphiqueVehicule {
    @Override
    public void affiche() {
        System.out.println("Affichage du véhicule");
    }
}
