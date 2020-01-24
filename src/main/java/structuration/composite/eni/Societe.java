package structuration.composite.eni;

/**
 * Societe est le composant
 * Elle implemente les methodes communes  et introduit une methode permettant de créer des composants
 */
public abstract class Societe {

    private static double coutUnitaireVehicule = 5.0;
    private int nbVehicules;

    public static double getCoutUnitaireVehicule() {
        return coutUnitaireVehicule;
    }

    public static void setCoutUnitaireVehicule(double coutUnitaireVehicule) {
        Societe.coutUnitaireVehicule = coutUnitaireVehicule;
    }

    public void ajouteVehicule(){
        nbVehicules+=1;
    }

    public abstract double calculeCoutEntretien();

    public abstract boolean ajouteFiliale(Societe filiale);

    public int getNbVehicules() {
        return nbVehicules;
    }

    public void setNbVehicules(int nbVehicules) {
        this.nbVehicules = nbVehicules;
    }
}
