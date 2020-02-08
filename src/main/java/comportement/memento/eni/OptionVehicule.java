package comportement.memento.eni;

import java.util.ArrayList;
import java.util.List;

public class OptionVehicule {
    private String nom;
    private List<OptionVehicule> optionsIncompatibles = new ArrayList<>();

    public OptionVehicule(String nom) {
        this.nom = nom;
    }

    public void ajouteOptionIncompatible(OptionVehicule optionIncompatible){
        if(!optionsIncompatibles.contains(optionIncompatible)){
            optionsIncompatibles.add(optionIncompatible);
            optionIncompatible.ajouteOptionIncompatible(this);
        }
    }

    public List<OptionVehicule> getOptionsIncompatibles() {
        return optionsIncompatibles;
    }

    public void affiche(){
        System.out.println("Option : "+nom);
    }
}
