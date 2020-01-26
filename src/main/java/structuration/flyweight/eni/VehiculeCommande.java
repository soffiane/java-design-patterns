package structuration.flyweight.eni;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class VehiculeCommande {
    private List<OptionVehicule> options = new ArrayList<>();
    private List<Integer> prixDeVenteOptions = new ArrayList<>();

    public void ajouteOption(String nom,int prixDeVente,FabriqueOption fabrique){
        options.add(fabrique.getOption(nom));
        prixDeVenteOptions.add(prixDeVente);
    }

    public void afficheOptions() {
        IntStream.range(0, options.size()).forEach(i -> options.get(i).affiche(prixDeVenteOptions.get(i)));
    }
}
