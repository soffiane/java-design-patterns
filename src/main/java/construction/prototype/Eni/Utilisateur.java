package construction.prototype.Eni;

public class Utilisateur {

    public static void main(String... args){
        LiasseVierge liasseVierge = LiasseVierge.getInstance();
        liasseVierge.ajoute(new BonDeCommande());
        liasseVierge.ajoute(new CertificatCession());
        liasseVierge.ajoute(new DemandeImmatriculation());

        LiasseClient liasseClient1 = new LiasseClient("Soffiane");
        LiasseClient liasseClient2 = new LiasseClient("Sonia");
        liasseClient1.affiche();
        liasseClient2.affiche();
    }
}
