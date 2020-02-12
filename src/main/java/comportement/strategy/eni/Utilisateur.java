package comportement.strategy.eni;

public class Utilisateur {
    public static void main(String[] args){
        VueCatalogue vueCatalogue1 = new VueCatalogue(new DessinUnVehiculeLigne());
        vueCatalogue1.dessine();

        VueCatalogue vueCatalogue2 = new VueCatalogue(new DessinTroisVehiculeLigne());
        vueCatalogue2.dessine();
    }
}
