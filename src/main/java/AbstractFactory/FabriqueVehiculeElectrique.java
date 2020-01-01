package AbstractFactory;

public class FabriqueVehiculeElectrique implements FabriqueVehicule {
    @Override
    public Automobile creerAutomobile(String modele, String couleur, int puissance, double espace) {
        return new AutomobileElectrique(modele,couleur,puissance,espace);
    }

    @Override
    public Scooter creerScooter(String modele, String couleur, int puissance) {
        return new ScooterElectrique(modele,couleur,puissance);
    }

}
