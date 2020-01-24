package structuration.bridge.eni;

public class FormulaireImmatriculationLux extends FormulaireImmatriculation {
    /**
     * implantation instance gerant l'implementation des formulaire
     *
     * @param implantation
     */
    public FormulaireImmatriculationLux(FormulaireImpl implantation) {
        super(implantation);
    }

    @Override
    public boolean controleSaisie(String plaque) {
        return plaque.length() == 5;
    }
}
