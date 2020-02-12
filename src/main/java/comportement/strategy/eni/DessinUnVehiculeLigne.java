package comportement.strategy.eni;

import java.util.List;

public class DessinUnVehiculeLigne implements DessinCatalogue {
    @Override
    public void dessine(List<VueVehicule> contenu) {
        System.out.println("Dessine les vehicules avec un vehicule par ligne");
        contenu.forEach(VueVehicule::dessine);
    }
}
