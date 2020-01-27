package comportement.chainofresponsibility.eni;

public class Modele extends ObjetBase {
    private String nom;
    private String description;

    public Modele(String nom, String description) {
        this.nom = nom;
        this.description = description;
    }

    @Override
    protected String getDescription() {
        if(description != null){
            return "Modele "+nom+" : "+description;
        } else {
            return null;
        }
    }
}
