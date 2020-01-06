package AbstractFactory.Eni;

import java.util.Scanner;

public class Catalogue {

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        FabriqueVehicule fabrique;
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
