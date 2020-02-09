package comportement.observer.eni;

import java.util.ArrayList;
import java.util.List;

public abstract class Sujet {
    private List<Observateur> observateurs = new ArrayList<>();
    public void ajoute(Observateur observateur){
        observateurs.add(observateur);
    }
    public void retire(Observateur observateur){
        observateurs.remove(observateur);
    }
    public void notifie(){
        observateurs.forEach(Observateur::actualise);
    }
}
