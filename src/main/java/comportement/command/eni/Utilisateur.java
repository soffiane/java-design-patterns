package comportement.command.eni;

import java.time.LocalDate;

public class Utilisateur {
    public static void main(String[] args){
        Vehicule vehicule1 = new Vehicule("A01", 1,1000.0);
        Vehicule vehicule2 = new Vehicule("A02",6,2000.0);
        Vehicule vehicule3 = new Vehicule("A03",2,3000.0);

        Catalogue catalogue = new Catalogue();
        catalogue.ajoute(vehicule1);
        catalogue.ajoute(vehicule2);
        catalogue.ajoute(vehicule3);

        System.out.println("Affichage catalogue : ");
        catalogue.affiche();

        CommandeSoldee commandeSoldee = new CommandeSoldee(10,5,0.1);
        catalogue.lanceCommandeSoldee(commandeSoldee);

        System.out.println("Affichage catalogue apres : ");
        catalogue.affiche();

        CommandeSoldee commandeSoldee2 = new CommandeSoldee(10,5,0.5);
        catalogue.lanceCommandeSoldee(commandeSoldee2);

        System.out.println("Affichage catalogue apres bis : ");
        catalogue.affiche();

        catalogue.annuleCommandeSoldee(1);
        System.out.println("Affichage catalogue apres ter : ");
        catalogue.affiche();

        catalogue.retablitCommandeSoldee(1);
        System.out.println("Affichage catalogue apres quatre : ");
        catalogue.affiche();
    }
}
