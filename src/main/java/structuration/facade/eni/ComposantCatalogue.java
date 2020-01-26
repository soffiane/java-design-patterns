package structuration.facade.eni;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ComposantCatalogue implements Catalogue {

    private Map<String, Integer> descriptionsVehicule = Stream.of(new Object[][] {
            { "Berline 5 Portes", 6000 },
            { "Compact 3 portes", 4000 },
            { "Espace 5 portes", 8000 },
            { "Break 5 portes", 7000 },
            { "Coupé 2 portes", 9000 },
            { "Utilitaire 3 portes", 5000 },
    }).collect(Collectors.toMap(data -> (String) data[0], data -> (Integer) data[1]));

    @Override
    public List<String> retrouveVehicules(int prixMoyen, int prixEcart) {
        return descriptionsVehicule.entrySet().stream()
                .filter(description -> description.getValue() >= prixMoyen - prixEcart && description.getValue() <= prixMoyen + prixEcart)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
