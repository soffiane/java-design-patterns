package comportement.iterator.eni;

import java.util.List;

/**
 * Classe abstraite qui implemente l'association de l'iterateur avec les elements de la collection
 * @param <TElement> objet heritant de Element
 */
public abstract class Iterateur<TElement extends Element> {

    private String motCleRequete;
    private int index;
    //liste avec type parametrée
    private List<TElement> contenu;

    public void setMotCleRequete(String motCleRequete, List<TElement> contenu){
        this.motCleRequete = motCleRequete;
        this.contenu = contenu;
    }

    public void debut(){
        index = 0;
        int taille = contenu.size();
        while( index < taille && !contenu.get(index).motCleValide(motCleRequete)){
            index++;
        }
    }

    public void suivant(){
        index++;
        while (index < contenu.size() && !contenu.get(index).motCleValide(motCleRequete)) {
            index++;
        }
    }

    public TElement item(){
        if(index < contenu.size()){
            return contenu.get(index);
        } else {
            return null;
        }
    }
}
