package AbstractFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Catalogue {

    public static int nbAutos = 3;
    public static int nbScooter = 2;

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        FabriqueVehicule fabrique;
        List<Automobile> autos = new ArrayList<>();
        List<Scooter> scooters = new ArrayList<>();
        System.out.println("Vehicule essence (1) ou electrique (2) ? : 2");
        String choix = reader.next();
        if("1".equals(choix)){
            fabrique = new FabriqueVehiculeEssence();
        } else {
            fabrique = new FabriqueVehiculeElectrique();
        }
        fabrique.creerAutomobile("standard","jaune",6,3.2).afficheCaracteristiques();
        fabrique.creerScooter("classic","rouge",2).afficheCaracteristiques();

    }
}
