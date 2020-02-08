package comportement.memento.eni;

import java.util.ArrayList;
import java.util.List;

public class ChariotOption {
    private List<OptionVehicule> options = new ArrayList<>();

    public Memento ajouteOption(OptionVehicule optionVehicule){
        MementoImpl resultat = new MementoImpl();
        resultat.setEtat(options);
        options.removeAll(optionVehicule.getOptionsIncompatibles());
        options.add(optionVehicule);
        return resultat;
    }

    public void annule(Memento memento){
        MementoImpl mementoImplInstance;
        try{
            mementoImplInstance = (MementoImpl)memento;
        }catch(ClassCastException e){
            return;
        }
        options = mementoImplInstance.getEtat();
    }

    public void affiche(){
        System.out.println("Contenu du chariot des options");
        options.forEach(OptionVehicule::affiche);
    }
}
