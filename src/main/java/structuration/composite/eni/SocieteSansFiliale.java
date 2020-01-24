package structuration.composite.eni;

public class SocieteSansFiliale extends Societe {
    @Override
    public double calculeCoutEntretien() {
        return getNbVehicules() * getCoutUnitaireVehicule();
    }

    @Override
    public boolean ajouteFiliale(Societe filiale) {
        return false;
    }
}
