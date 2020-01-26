package structuration.facade.eni;

import java.util.List;

/**
 * Interface qui introduit la signature des methodes destinés aux clients du WS
 */
public interface WebServiceAuto {
    String document(int index);
    List<String> chercheVehicule(int prixMoyen, int ecartMax);
}
