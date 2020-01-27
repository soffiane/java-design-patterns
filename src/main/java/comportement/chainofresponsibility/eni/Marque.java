package comportement.chainofresponsibility.eni;

public class Marque extends ObjetBase {
    private String description;
    private String descriptionDetaillee;
    private String nom;

    public Marque(String nom, String description, String descriptionDetaillee) {
        this.description = description;
        this.descriptionDetaillee = descriptionDetaillee;
        this.nom = nom;
    }

    @Override
    protected String getDescription() {
        if((description != null) && (descriptionDetaillee != null)){
            return "Marque "+nom+" : "+description+" : "+descriptionDetaillee;
        } else if(description != null){
            return "Marque "+nom+" : "+description;
        } else {
            return null;
        }
    }
}
