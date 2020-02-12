package comportement.strategy.eni;

import java.util.ArrayList;
import java.util.List;

public class VueCatalogue {
    private List<VueVehicule> contenu = new ArrayList<>();
    private DessinCatalogue dessinCatalogue;

    public VueCatalogue(DessinCatalogue dessinCatalogue) {
        contenu.add(new VueVehicule("vehicule bon marche"));
        contenu.add(new VueVehicule("vehicule confortable"));
        contenu.add(new VueVehicule("vehicule rapide"));
        contenu.add(new VueVehicule("vehicule spacieux"));
        contenu.add(new VueVehicule("vehicule sportif"));
        this.dessinCatalogue = dessinCatalogue;
    }

    public void dessine(){
        dessinCatalogue.dessine(contenu);
    }
}
