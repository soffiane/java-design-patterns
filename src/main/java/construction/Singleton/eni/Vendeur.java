package construction.Singleton.eni;

public class Vendeur {

    private String nom;
    private String adresse;
    private String email;

    private static Vendeur instance = null;


    public static Vendeur getInstance() {
        if(instance == null){
            instance = new Vendeur();
        }
        return instance;
    }

    public void affiche(){
        System.out.print("Nom : "+nom+"\nAdresse : "+adresse+"\nEmail : "+email);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
