package structuration.flyweight.eni;

public class OptionVehicule {

    private String nom;
    private String description;
    private int prixStandard;

    public OptionVehicule(String nom) {
        this.nom = nom;
        this.description = "Description de "+nom;
        this.prixStandard = 100;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrixStandard() {
        return prixStandard;
    }

    public void setPrixStandard(int prixStandard) {
        this.prixStandard = prixStandard;
    }

    public void affiche(int prixDeVente){
        System.out.println("Option : "+nom+" Description : "+description+" prix standard : "+prixStandard+" prix de vente : "+prixDeVente);
    }
}
