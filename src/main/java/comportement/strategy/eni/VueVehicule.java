package comportement.strategy.eni;

public class VueVehicule {

    private String description;

    public VueVehicule(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void dessine(){
        System.out.println(description);
    }
}
