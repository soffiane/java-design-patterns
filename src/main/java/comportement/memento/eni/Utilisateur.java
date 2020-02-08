package comportement.memento.eni;

public class Utilisateur {
    public static void main(String[] args){
        Memento memento;

        OptionVehicule optionVehicule1 = new OptionVehicule("Sieges en cuir");
        OptionVehicule optionVehicule2 = new OptionVehicule("Accoudoirs");
        OptionVehicule optionVehicule3 = new OptionVehicule("Sieges sportifs");

        //siege en cuir et sieges sportifs sont incompatibles
        optionVehicule1.ajouteOptionIncompatible(optionVehicule3);
        //accoudoirs et sieges sportifs sont incompatibles
        optionVehicule2.ajouteOptionIncompatible(optionVehicule3);

        ChariotOption chariotOption = new ChariotOption();
        chariotOption.ajouteOption(optionVehicule1);
        chariotOption.ajouteOption(optionVehicule2);
        chariotOption.affiche();

        memento = chariotOption.ajouteOption(optionVehicule3);
        chariotOption.affiche();
        chariotOption.annule(memento);
        chariotOption.affiche();
    }
}
