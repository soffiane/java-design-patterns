package comportement.state.eni;

public class Produit {
    private String nom;

    public Produit(String nom) {
        this.nom = nom;
    }

    public void affiche(){
        System.out.println("Produit : "+nom);
    }
}
