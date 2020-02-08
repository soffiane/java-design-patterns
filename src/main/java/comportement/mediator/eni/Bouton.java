package comportement.mediator.eni;

import java.util.Scanner;

public class Bouton extends Controle {
    Scanner reader = new Scanner(System.in);
    public Bouton(String valeur, String nom) {
        super(valeur, nom);
    }
    @Override
    public void saisie(){
        System.out.println("Desirez-vous activer le bouton : "+getNom()+" ?");
        String reponse = reader.nextLine();
        if(reponse.equals("oui")){
            this.modifie();
        }
    }
}
