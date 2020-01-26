package structuration.decorator.eni;

public abstract class Decorateur implements ComposantGraphiqueVehicule{

    public ComposantGraphiqueVehicule composantGraphiqueVehicule;

    public Decorateur(ComposantGraphiqueVehicule composantGraphiqueVehicule) {
        this.composantGraphiqueVehicule = composantGraphiqueVehicule;
    }

    @Override
    public void affiche() {
        composantGraphiqueVehicule.affiche();
    }
}
