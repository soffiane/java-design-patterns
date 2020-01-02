package Builder;

public class Vendeur {

    private ConstructeurLiasseVehicule constructeurLiasseVehicule;

    public Vendeur(ConstructeurLiasseVehicule constructeurLiasseVehicule) {
        this.constructeurLiasseVehicule = constructeurLiasseVehicule;
    }

    public Liasse construireLiasse(String nomClient) {
        constructeurLiasseVehicule.construitBonDeCOmmande(nomClient);
        constructeurLiasseVehicule.construitDemandeImmatriculation(nomClient);
        return constructeurLiasseVehicule.resultat();
    }
}
