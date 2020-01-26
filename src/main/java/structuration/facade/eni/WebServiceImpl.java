package structuration.facade.eni;

import java.util.List;

/**
 * Implementation des services : utilise les deux composants Catalogue et GestionDocument
 */
public class WebServiceImpl implements WebServiceAuto {
    private Catalogue catalogue = new ComposantCatalogue();
    private GestionDocument gestionDocument = new ComposantGestionDocument();
    @Override
    public String document(int index) {
        return gestionDocument.document(index);
    }

    @Override
    public List<String> chercheVehicule(int prixMoyen, int ecartMax) {
        return catalogue.retrouveVehicules(prixMoyen,ecartMax);
    }
}
