package construction.Singleton.eni;

public class TestVendeur {

    public static void main(String[] args){
        Vendeur vendeur = Vendeur.getInstance();
        vendeur.setAdresse("Adresse");
        vendeur.setNom("Boudissa");
        vendeur.setEmail("a@b.fr");
        affiche();
    }

    private static void affiche() {
        Vendeur vendeur = Vendeur.getInstance();
        vendeur.affiche();
    }
}
