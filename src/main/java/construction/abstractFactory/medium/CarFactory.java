package construction.abstractFactory.medium;

/**
 * On a besoin d'une factory pour savoir quel objet on va instancier dans la hierarchie Car -> Jeep, Car -> Truck
 */
public class CarFactory {

    public CarFactory() {
    }

    public Car getCarType(String model, Integer numberOfDoors, Integer numberOfWheels, Boolean isLand) {
        if (numberOfWheels == null) {
            return new Jeep(model, numberOfDoors, isLand);
        } else {
            return new Truck(model, numberOfDoors, numberOfWheels);
        }
    }
}
