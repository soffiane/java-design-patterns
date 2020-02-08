package comportement.mediator.eni;

/**
 * Elements communs à tous les elements graphiques
 */
public abstract class Controle {
    private String valeur;
    private Formulaire directeur;
    private String nom;

    public Controle(String valeur, String nom) {
        this.valeur = valeur;
        this.nom = nom;
    }

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    public Formulaire getDirecteur() {
        return directeur;
    }

    public void setDirecteur(Formulaire directeur) {
        this.directeur = directeur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    protected void modifie(){
        getDirecteur().controleModifie(this);
    }

    public abstract void saisie();
}
