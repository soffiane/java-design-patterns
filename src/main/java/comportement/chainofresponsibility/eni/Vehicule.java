package comportement.chainofresponsibility.eni;

public class Vehicule extends ObjetBase {
    private String description;

    public Vehicule(String description) {
        this.description = description;
    }

    @Override
    protected String getDescription() {
        return description;
    }
}
