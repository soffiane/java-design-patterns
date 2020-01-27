package structuration.proxy.eni;

public class VueVehicule {
    public static void main(String[] args){
        //on passe par le proxy
        Animation animation = new AnimationProxy();
        animation.dessine();
        animation.clic();
        animation.dessine();
    }
}
