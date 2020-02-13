package comportement.visitor.eni;

import java.util.ArrayList;
import java.util.List;

public class SocieteMere extends Societe {
    private List<Societe> filiales = new ArrayList<>();
    public SocieteMere(String nom, String email, String adresse) {
        super(nom, email, adresse);
    }

    @Override
    public boolean ajouteFiliale(Societe filiale) {
        return filiales.add(filiale);
    }

    @Override
    public void accepteVisiteur(Visiteur visiteur) {
        visiteur.visite(this);
        filiales.forEach(societe -> societe.accepteVisiteur(visiteur));
    }
}
