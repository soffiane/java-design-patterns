package comportement.iterator.eni;

import java.util.ArrayList;
import java.util.List;

/**
 * Catalogue implemente l'association de la Collection avec les elements via la methode creeIterateur()
 */
public abstract class Catalogue<TElement extends Element, TIterateur extends Iterateur<TElement>> {
    private List<TElement> contenu = new ArrayList<>();

    protected abstract TIterateur creeTIterateur();

    public TIterateur recherche(String motCleRequete){
        TIterateur resultat = creeTIterateur();
        resultat.setMotCleRequete(motCleRequete,contenu);
        return resultat;
    }

    public List<TElement> getContenu() {
        return contenu;
    }
}
