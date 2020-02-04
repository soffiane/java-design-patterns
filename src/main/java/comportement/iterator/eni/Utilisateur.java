package comportement.iterator.eni;

public class Utilisateur {
    public static void main(String[] args){
        CatalogueVehicule catalogueVehicule = new CatalogueVehicule();
        IterateurVehicule iterateurVehicule = catalogueVehicule.recherche("bon marche");
        iterateurVehicule.debut();
        Vehicule vehicule = iterateurVehicule.item();
        while (vehicule != null){
            vehicule.affiche();
            iterateurVehicule.suivant();
            vehicule = iterateurVehicule.item();
        }
    }
}
