package structuration.composite.eni;

public class Utilisateur {
    public static void main(String[] args){
        Societe societe1 = new SocieteSansFiliale();
        societe1.ajouteVehicule();

        System.out.println("Cout d'entretien societe1 : "+societe1.calculeCoutEntretien());

        Societe societe2 = new SocieteSansFiliale();
        societe2.ajouteVehicule();
        societe2.ajouteVehicule();

        System.out.println("Cout d'entretien societe2 : "+societe2.calculeCoutEntretien());

        Societe groupe = new SocieteMere();
        groupe.ajouteFiliale(societe1);
        groupe.ajouteFiliale(societe2);
        groupe.ajouteVehicule();

        System.out.println("Cout d'entretien total du groupe : "+groupe.calculeCoutEntretien());
    }
}
