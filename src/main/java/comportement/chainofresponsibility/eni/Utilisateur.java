package comportement.chainofresponsibility.eni;

public class Utilisateur {
    public static void main(String[] args){
        ObjetBase vehicule1 = new Vehicule("Auto++ KT500 etc...");
        System.out.println(vehicule1.donneDescrition());

        ObjetBase modele1 = new Modele("KT400","vehicule spacieux et confortable");
        ObjetBase vehicule2 = new Vehicule(null);
        vehicule2.setSuivant(modele1);
        System.out.println(vehicule2.donneDescrition());

        ObjetBase marque1 = new Marque("Auto++","Marque des autos","de grande qualité");
        ObjetBase modele2 = new Modele("KT700+",null);
        modele2.setSuivant(marque1);
        ObjetBase vehicule3 = new Vehicule(null);
        vehicule3.setSuivant(modele2);
        System.out.println(vehicule3.donneDescrition());

        ObjetBase vehicule4 = new Vehicule(null);
        System.out.println(vehicule4.donneDescrition());
    }
}
