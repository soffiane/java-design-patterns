package structuration.bridge.eni;

public class FormulaireImmatriculationFrance extends FormulaireImmatriculation {
    /**
     * implantation instance gerant l'implementation des formulaire
     *
     * @param implantation
     */
    public FormulaireImmatriculationFrance(FormulaireImpl implantation) {
        super(implantation);
    }

    @Override
    public boolean controleSaisie(String plaque) {
        return plaque.length() == 7;
    }
}
