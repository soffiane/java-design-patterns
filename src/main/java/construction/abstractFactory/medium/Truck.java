package construction.abstractFactory.medium;

public class Truck implements Car {
    private String model;
    private Integer numberOfDoors;
    private Integer numberOfWheels;

    public Truck(String model, Integer numberOfDoors, Integer numberOfWheels) {
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.numberOfWheels = numberOfWheels;
    }

    public Truck() {
    }

    public String getModel() {
        return model;
    }

    public Integer getNumberOfDoors() {
        return numberOfDoors;
    }

    public Integer getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(Integer numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumberOfDoors(Integer numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getType() {
        return "truck";
    }
}