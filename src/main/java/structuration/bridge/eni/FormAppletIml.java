package structuration.bridge.eni;

import java.util.Scanner;
/**
 * Simule affichage applet java
 */
public class FormAppletIml implements FormulaireImpl {
    Scanner reader = new Scanner(System.in);
    @Override
    public void dessineTexte(String texte) {
        System.out.println("Applet : "+texte);
    }

    @Override
    public String gereZoneTexte() {
        return reader.next();
    }
}
