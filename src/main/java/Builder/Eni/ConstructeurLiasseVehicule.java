package Builder.Eni;

public abstract class ConstructeurLiasseVehicule {

    protected Liasse liasse;

    public abstract void construitBonDeCOmmande(String nomClient);

    public abstract void construitDemandeImmatriculation(String nomDemandeur);

    public Liasse resultat(){
        return liasse;
    }
}
