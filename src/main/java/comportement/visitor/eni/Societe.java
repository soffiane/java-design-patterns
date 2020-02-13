package comportement.visitor.eni;

/**
 * Classe abstraite des classes d'elements dont on veut faire la visite
 */
public abstract class Societe {
    private String nom;
    private String email;
    private String adresse;

    public Societe(String nom, String email, String adresse) {
        this.nom = nom;
        this.email = email;
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public abstract boolean ajouteFiliale(Societe filiale);

    public abstract void accepteVisiteur(Visiteur visiteur);
}
