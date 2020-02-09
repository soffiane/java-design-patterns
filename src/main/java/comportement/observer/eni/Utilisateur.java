package comportement.observer.eni;

public class Utilisateur {
    public static void main(String[] args){
        Vehicule vehicule = new Vehicule();
        vehicule.setDescription("Vehicule bon marche");
        vehicule.setPrix(5000.0);

        VueVehicule vueVehicule = new VueVehicule(vehicule);
        vueVehicule.redessine();

        vehicule.setPrix(4500.0);

        //VueVehicule vueVehicule1 = new VueVehicule(vehicule);
        vehicule.setPrix(5500.0);

        vehicule.setDescription("vehicule cher");
        vehicule.setPrix(1000000.0);
    }
}
