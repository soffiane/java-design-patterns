package comportement.command.eni;

import java.util.ArrayList;
import java.util.List;

public class Catalogue {
    private List<Vehicule> vehiculesStock = new ArrayList<>();
    private List<CommandeSoldee> commandes = new ArrayList<>();

    public void lanceCommandeSoldee(CommandeSoldee commande){
        commandes.add(0,commande);
        commande.solde(vehiculesStock);
    }

    public void annuleCommandeSoldee(int ordre){
        commandes.get(ordre).annule();
    }

    public void retablitCommandeSoldee(int ordre){
        commandes.get(ordre).retablit();
    }

    public void ajoute(Vehicule vehicule){
        vehiculesStock.add(vehicule);
    }

    public void affiche(){
        vehiculesStock.stream().forEach(Vehicule::affiche);
    }
}
