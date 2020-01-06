package construction.builder.Eni;

import java.util.Scanner;

public class ClientVehicule {

    public static void main(String... args){
        Scanner scanner = new Scanner(System.in);
        ConstructeurLiasseVehicule constructeurLiasseVehicule;
        System.out.print("liasse HTML (1) ou PDF (2) ? ");
        if("1".equals(scanner.next())){
            constructeurLiasseVehicule = new ConstructeurLiasseVehiculeHtml();
        } else {
            constructeurLiasseVehicule = new ConstructeurLiasseVehiculePdf();
        }
        Vendeur vendeur = new Vendeur(constructeurLiasseVehicule);
        vendeur.construireLiasse("Soffiane Boudissa").imprime();
    }
}
