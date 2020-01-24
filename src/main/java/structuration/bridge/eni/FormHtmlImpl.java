package structuration.bridge.eni;

import java.util.Scanner;

/**
 * Simule affichage formulaire HTML
 */
public class FormHtmlImpl implements FormulaireImpl {

    Scanner reader = new Scanner(System.in);
    @Override
    public void dessineTexte(String texte) {
        System.out.println("HTML : "+texte);
    }

    @Override
    public String gereZoneTexte() {
        return reader.next();
    }
}
