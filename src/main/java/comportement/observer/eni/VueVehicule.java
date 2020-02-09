package comportement.observer.eni;

public class VueVehicule implements Observateur {

    private Vehicule vehicule;
    private String texte;

    public VueVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
        vehicule.ajoute(this);
        metAJourTexte();
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    private void metAJourTexte() {
        setTexte("Description "+vehicule.getDescription()+" Prix "+vehicule.getPrix());
    }

    @Override
    public void actualise() {
        metAJourTexte();
        this.redessine();
    }

    @Override
    public void redessine() {
        System.out.println(texte);
    }
}
