package comportement.strategy.eni;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class DessinTroisVehiculeLigne implements DessinCatalogue {
    @Override
    public void dessine(List<VueVehicule> contenu) {
        int compteur = 0;
        System.out.println("Dessine les vehicules avec trois vehicules par lignes");
        for(VueVehicule vueVehicule : contenu){
            vueVehicule.dessine();;
            compteur++;
            if(compteur == 3){
                System.out.println();
                compteur = 0;
            } else {
                System.out.println(" ");
            }
        }
        if(compteur != 0){
            System.out.println();
        }
        System.out.println();
        /*contenu.forEach(vueVehicule -> {
            vueVehicule.dessine();
            compteur.getAndIncrement();
            if(compteur.get() == 3){
                compteur.set(0);
            }
        });*/
    }
}
