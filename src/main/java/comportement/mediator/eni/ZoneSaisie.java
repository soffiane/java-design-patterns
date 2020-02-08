package comportement.mediator.eni;

import java.util.Scanner;

public class ZoneSaisie extends Controle {
    Scanner reader = new Scanner(System.in);
    public ZoneSaisie(String valeur, String nom) {
        super(valeur, nom);
    }
    @Override
    public void saisie(){
        System.out.println("Saisie de : "+getNom());
        setValeur(reader.nextLine());
        this.modifie();
    }
}
