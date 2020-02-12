package comportement.strategy.eni;

import java.util.List;

/**
 * Interface commune pour tous les algorithmes
 * Invoquée par Entité (VueCatalogue)
 */
public interface DessinCatalogue {
    void dessine(List<VueVehicule> contenu);
}
