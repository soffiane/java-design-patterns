package comportement.mediator.eni;

public class Utilisateur {
    public static void main(String[] args){
        Formulaire formulaire = new Formulaire();
        formulaire.ajouteControle(new ZoneSaisie("","Nom"));
        formulaire.ajouteControle(new ZoneSaisie("","Prenom"));

        PopupMenu popupMenu = new PopupMenu("","Coemprunteur");
        popupMenu.ajouteOptions("sans coemprunteur");
        popupMenu.ajouteOptions("avec coemprunteur");

        formulaire.ajouteControle(popupMenu);
        formulaire.setMenuCoemprunteur(popupMenu);

        Bouton bouton = new Bouton("","OK");
        formulaire.ajouteControle(bouton);
        formulaire.setBoutonOk(bouton);
        formulaire.ajouteControleCoemprunteur(new ZoneSaisie("","Nom du coemprunteur"));
        formulaire.ajouteControleCoemprunteur(new ZoneSaisie("","Prenom du coemprunteur"));

        formulaire.saisie();
    }
}
