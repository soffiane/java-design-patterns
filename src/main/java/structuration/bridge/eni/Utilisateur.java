package structuration.bridge.eni;

public class Utilisateur {
    public static void main(String[] args){
        FormulaireImmatriculationLux formulaireImmatriculationLux = new FormulaireImmatriculationLux(new FormHtmlImpl());
        formulaireImmatriculationLux.affiche();
        if(formulaireImmatriculationLux.gereSaisie()){
            formulaireImmatriculationLux.genereDocument();
        }

        FormulaireImmatriculationFrance formulaireImmatriculationFrance = new FormulaireImmatriculationFrance(new FormAppletIml());
        formulaireImmatriculationFrance.affiche();
        if(formulaireImmatriculationFrance.gereSaisie()){
            formulaireImmatriculationFrance.genereDocument();
        }
    }
}
