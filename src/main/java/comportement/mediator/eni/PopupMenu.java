package comportement.mediator.eni;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PopupMenu extends Controle {
    Scanner reader = new Scanner(System.in);
    private List<String> options = new ArrayList<>();
    public PopupMenu(String valeur, String nom) {
        super(valeur, nom);
    }
    @Override
    public void saisie(){
        System.out.println("Saisie de : "+getNom());
        System.out.println("Valeur actuelle : "+getValeur());
        for(int i = 0; i<options.size();i++){
            System.out.println("- "+i+" )"+options.get(i));
        }
        int choix = reader.nextInt();
        if(choix >=0 && choix<options.size()){
            if(!(getValeur().equals(options.get(choix)))){
                setValeur(options.get(choix));
                this.modifie();
            }
        }
    }
    public void ajouteOptions(String option){
        options.add(option);
    }
}
