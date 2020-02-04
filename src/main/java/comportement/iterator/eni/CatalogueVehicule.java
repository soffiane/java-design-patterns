package comportement.iterator.eni;

/**
 * Implementation de Catalogue qui lie TElement a Vehicule et TIterateur a VehiculeIterateur
 */
public class CatalogueVehicule extends Catalogue<Vehicule,IterateurVehicule>{
    public CatalogueVehicule(){
        getContenu().add(new Vehicule("vehicule bon marche"));
        getContenu().add(new Vehicule("petit vehicule bon marche"));
        getContenu().add(new Vehicule("vehicule grand taille"));
    }
    @Override
    protected IterateurVehicule creeTIterateur() {
        return new IterateurVehicule();
    }
}
