package construction.abstractFactory.medium;

public class CarMain {

    public static void main(String[] args) {
        Car car=null;
        CarFactory carFactory=new CarFactory();
        car=carFactory.getCarType("Ford", 4, null, true);
        System.out.println(car.getType());
    }
}
