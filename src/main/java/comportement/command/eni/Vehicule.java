package comportement.command.eni;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Vehicule est le recepteur : il traite les actions necessaire pour effectuer la commande ou l'annuler
 */
public class Vehicule {
    private String nom;
    private long dateEntreeEnStock;
    private double prixVente;

    public Vehicule(String nom, long dateEntreeEnStock, double prixVente) {
        this.nom = nom;
        this.dateEntreeEnStock = dateEntreeEnStock;
        this.prixVente = prixVente;
    }

    public long getDureeStockage(long aujourdhui){
        return aujourdhui - dateEntreeEnStock;
    }

    public void modifiePrix(double coefficient){
        this.prixVente = 0.01 * Math.round(coefficient * this.prixVente * 100);
    }

    public void affiche(){
        System.out.println(nom + " prix : "+prixVente+ " date entree en stock "+dateEntreeEnStock);
    }
}
