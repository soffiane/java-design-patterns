package structuration.flyweight.eni;

import java.util.Map;
import java.util.TreeMap;

public class FabriqueOption {
    private Map<String, OptionVehicule> options = new TreeMap<>();

    public OptionVehicule getOption(String nom) {
        boolean optionExist = options.entrySet().stream()
                .anyMatch(option -> nom.equals(option.getKey()));
        if (!optionExist) {
            OptionVehicule optionVehicule = new OptionVehicule(nom);
            options.put(nom, optionVehicule);
        }
        return options.get(nom);
    }
}
