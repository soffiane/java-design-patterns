package structuration.composite.eni;

import java.util.ArrayList;
import java.util.List;

public class SocieteMere extends Societe {
    List<Societe> filiales = new ArrayList<>();
    @Override
    public double calculeCoutEntretien() {
        double cout = filiales.stream().mapToDouble(Societe::calculeCoutEntretien).sum();
        return cout + getNbVehicules() * getCoutUnitaireVehicule();
    }

    @Override
    public boolean ajouteFiliale(Societe filiale) {
        return filiales.add(filiale);
    }
}
