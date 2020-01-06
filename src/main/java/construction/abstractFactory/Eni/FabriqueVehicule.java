/**
 * Cette interface implemente les deux methodes : une pour chaque classe abstraite
 * afin d'en instancier des objets
 */
package construction.abstractFactory.Eni;

public interface FabriqueVehicule {

    Automobile creerAutomobile(String modele, String couleur, int puissance, double espace);

    Scooter creerScooter(String modele, String couleur, int puissance);

    /**
    * methode default java 8
     */
    public default void foo() {
        System.out.println("Default implementation of foo()");
    }
}
