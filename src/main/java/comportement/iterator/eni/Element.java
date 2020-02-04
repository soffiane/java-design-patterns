package comportement.iterator.eni;

/**
 * Classe abstraite representant les elements de la Collection
 */
public abstract class Element {

    private String description;

    public Element(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean motCleValide(String motCle){
        return description.contains(motCle);
    }
}
