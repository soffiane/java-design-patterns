package construction.abstractFactory.medium;

public class Jeep implements Car {
    private String model;
    private Integer numberOfDoors;
    private Boolean isLand;

    public Jeep() {
    }

    public Jeep(String model, Integer numberOfDoors, Boolean isLand) {
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.isLand = isLand;
    }

    public String getModel() {
        return model;
    }

    public Integer getNumberOfDoors() {
        return numberOfDoors;
    }

    public Boolean isLand() {
        return isLand;
    }

    public void setLand(Boolean isLand) {
        this.isLand = isLand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumberOfDoors(Integer numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getType() {
        return "jeep";
    }
}
