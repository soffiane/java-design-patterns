package construction.builder.Eni;

public class ConstructeurLiasseVehiculeHtml extends ConstructeurLiasseVehicule {

    public ConstructeurLiasseVehiculeHtml() {
        liasse = new LiasseHtml();
    }

    @Override
    public void construitBonDeCOmmande(String nomClient) {
        String document = "<HTML> Bon de commande client : "+nomClient+" </HTML>";
        liasse.ajouteDocument(document);
    }

    @Override
    public void construitDemandeImmatriculation(String nomDemandeur) {
        String document = "<HTML> Demande immatriculation Demandeur : "+nomDemandeur+" </HTML>";
        liasse.ajouteDocument(document);
    }
}
