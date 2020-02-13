package comportement.visitor.eni;

/**
 * Cette classe implement le Visiteur ainsi que les fonctionnalités correspondant à la classe
 */
public class VisiteurMailingCommercial implements Visiteur {
    @Override
    public void visite(SocieteSansFiliale societe) {
        System.out.println("Envoi d'un mail à : "+societe.getNom()+" adresse "+societe.getEmail()+" Proposition commerciale pour votre societe");
    }

    @Override
    public void visite(SocieteMere societe) {
        System.out.println("Envoi d'un mail à : "+societe.getNom()+" adresse "+societe.getEmail()+" Proposition commerciale pour votre groupe");
        System.out.println("Envoi d'un courrier à : "+societe.getNom()+" adresse "+societe.getAdresse()+" Proposition commerciale pour votre groupe");
    }
}
