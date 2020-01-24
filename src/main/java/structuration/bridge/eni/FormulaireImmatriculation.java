package structuration.bridge.eni;

/**
 * Grace a ce pattern, on pourra rajouter des nouveaux types de formulaire
 * ou etendre les classes actuaelles sans casser le code
 * On introduit 2 niveaux d'abstraction afin de separer implementation et abstraction
 * On pourra ainsi les modifier sans casser la cohesion
 */
public abstract class FormulaireImmatriculation {

    private String contenu;
    private FormulaireImpl implantation;

    /**
     * implantation instance gerant l'implementation des formulaire
     * @param implantation
     */
    public FormulaireImmatriculation(FormulaireImpl implantation) {
        this.implantation = implantation;
    }

    public void affiche(){
        implantation.dessineTexte("numero de la plaque existante : ");
    }

    public void genereDocument(){
        implantation.dessineTexte("Demande immatriculation ");
        implantation.dessineTexte("numero de plaque + "+contenu);
    }

    public boolean gereSaisie(){
        contenu = implantation.gereZoneTexte();
        return this.controleSaisie(contenu);
    }
    //methode abstraite a specifier dans les implemenation de la classe
    public abstract boolean controleSaisie(String plaque);
}
