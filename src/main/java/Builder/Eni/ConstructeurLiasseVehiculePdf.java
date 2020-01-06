package Builder.Eni;

public class ConstructeurLiasseVehiculePdf extends ConstructeurLiasseVehicule {

    public ConstructeurLiasseVehiculePdf() {
        liasse = new LiassePdf();
    }

    @Override
    public void construitBonDeCOmmande(String nomClient) {
        String document = "<PDF> Bon de commande client : "+nomClient+" </PDF>";
        liasse.ajouteDocument(document);
    }

    @Override
    public void construitDemandeImmatriculation(String nomDemandeur) {
        String document = "<PDF> Demande immatriculation Demandeur : "+nomDemandeur+" </PDF>";
        liasse.ajouteDocument(document);
    }
}
