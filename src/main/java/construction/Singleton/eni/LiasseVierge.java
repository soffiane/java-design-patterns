package construction.Singleton.eni;

import construction.prototype.Eni.Liasse;

import java.util.ArrayList;

public final class LiasseVierge extends Liasse {

    private static LiasseVierge instance = null;

    private LiasseVierge(){
        setDocuments(new ArrayList<>());
    }

    public static LiasseVierge getInstance(){
        if(instance == null){
            instance = new LiasseVierge();
        }
        return instance;
    }
}
