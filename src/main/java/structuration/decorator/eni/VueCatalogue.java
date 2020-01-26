package structuration.decorator.eni;

public class VueCatalogue {

    public static void main(String[] args){
        VueVehicule vueVehicule = new VueVehicule();
        ModeleDecorateur modeleDecorateur = new ModeleDecorateur(vueVehicule);
        //on peut decorer un decorateur pour tout afficher
        MarqueDecorateur marqueDecorateur = new MarqueDecorateur(modeleDecorateur);
        marqueDecorateur.affiche();
    }
}
