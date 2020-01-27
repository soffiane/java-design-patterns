package comportement.chainofresponsibility.eni;

/**
 * implemente la chaine de responsabilités
 */
public abstract class ObjetBase {

    private ObjetBase suivant;

    private String descriptionParDefaut(){
        return "description par defaut";
    }
    protected abstract String getDescription();

    public String donneDescrition(){
        String resulat = this.getDescription();
        if(resulat != null){
            return resulat;
        }
        if(suivant != null){
            return suivant.getDescription();
        } else {
            return this.descriptionParDefaut();
        }
    }
    public void setSuivant(ObjetBase suivant){
        this.suivant = suivant;
    }
}
