package construction.prototype.Eni;

import java.util.ArrayList;

public class LiasseVierge extends Liasse {

    private static LiasseVierge instance = null;

    /* construteur private = innacessible en dehors de la classe */
    private LiasseVierge(){
        setDocuments(new ArrayList<Document>());
    }

    public static LiasseVierge getInstance(){
        if(instance == null){
            instance = new LiasseVierge();
        }
        return instance;
    }

    public void ajoute(Document doc){
        getDocuments().add(doc);
    }

    public void retire(Document doc){
        getDocuments().remove(doc);
    }
}
