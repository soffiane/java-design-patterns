package comportement.interpreter.eni;

import java.util.Scanner;

public class Utilisateur {
    public static void main(String[] args) {
        Expression expressionRequete = null;
        Scanner reader = new Scanner(System.in);
        System.out.println("Entrez la requete : ");//exemple : (rouge ou vert) et vieux et essence
        String requete = reader.nextLine();
        try {
            expressionRequete = Expression.analyse(requete);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            expressionRequete = null;
        }
        if(expressionRequete != null){
            System.out.println("Entrez la description du vehicule : ");
            String description = reader.nextLine();
            if(expressionRequete.evalue(description)){
                System.out.println("Descritpion correspond à la requete");
            } else {
                System.out.println("Descritpion ne correspond pas à la requete");
            }
        }
    }
}
