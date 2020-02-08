package comportement.mediator.eni;

import java.util.ArrayList;
import java.util.List;

/**
 * Coordination entre les elements et gere les associations entre ces derniers
 */
public class Formulaire {

    private List<Controle> controles = new ArrayList<>();
    private List<Controle> controlesCoemprunteur = new ArrayList<>();

    private PopupMenu menuCoemprunteur;
    private Bouton boutonOk;
    private boolean enCours = true;

    public void ajouteControle(Controle controle){
        controles.add(controle);
        controle.setDirecteur(this);
    }

    public void ajouteControleCoemprunteur(Controle controle){
        controlesCoemprunteur.add(controle);
        controle.setDirecteur(this);
    }

    public void setMenuCoemprunteur(PopupMenu menuCoemprunteur){
        this.menuCoemprunteur = menuCoemprunteur;
    }

    public void setBoutonOk(Bouton boutonOk) {
        this.boutonOk = boutonOk;
    }

    public void saisie(){
        while(true){
            for(Controle controle:controles){
                controle.saisie();
                if(!enCours){
                    return;
                }
            }
        }
    }

    public void controleModifie(Controle controle){
        if(controle == menuCoemprunteur){
            if("avec coemprunteur".equals(controle.getValeur())){
                controlesCoemprunteur.forEach(Controle::saisie);
            }
        }
        if(controle == boutonOk){
            enCours = false;
        }
    }
}