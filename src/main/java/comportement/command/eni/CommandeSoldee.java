package comportement.command.eni;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * La commande concrete
 * implemente la methode lance et gere l'association avec les recepteurs et stocke l'etat
 */
public class CommandeSoldee {
    private List<Vehicule> vehiculesSoldes = new ArrayList<>();
    private long aujourdhui;
    private long dureeStock;
    private double tauxRemise;

    public CommandeSoldee( long aujourdhui, long dureeStock,double tauxRemise) {
        this.aujourdhui = aujourdhui;
        this.dureeStock = dureeStock;
        this.tauxRemise = tauxRemise;
    }

    public void solde(List<Vehicule> vehicules){
        vehiculesSoldes.clear();
        vehicules.stream()
                .filter(vehicule -> vehicule.getDureeStockage(aujourdhui) >= dureeStock)
                .forEach(vehicule -> vehiculesSoldes.add(vehicule));
        vehiculesSoldes.stream().forEach(vehicule -> vehicule.modifiePrix(1.0-tauxRemise));
    }

    public void annule(){
        vehiculesSoldes.stream().forEach(vehicule -> vehicule.modifiePrix(1.0/(1.0-tauxRemise)));
    }

    public void retablit(){
        vehiculesSoldes.stream().forEach(vehicule -> vehicule.modifiePrix(1.0-tauxRemise));
    }
}
