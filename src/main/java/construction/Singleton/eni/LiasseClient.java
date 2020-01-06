package construction.Singleton.eni;

import construction.prototype.Eni.Document;
import construction.prototype.Eni.Liasse;

import java.util.ArrayList;
import java.util.List;

public class LiasseClient extends Liasse {

    public LiasseClient(String informations){
        setDocuments(new ArrayList<Document>());
        LiasseVierge liasseVierge = LiasseVierge.getInstance();
        List<Document> documentsVierges = liasseVierge.getDocuments();
        documentsVierges.forEach(document -> {
            Document duplique = document.duplique().get();
            duplique.remplir(informations);
            getDocuments().add(duplique);
        });
    }

    public void imprime() {
       getDocuments().forEach(Document::imprime);
    }

    public void affiche() {
        getDocuments().forEach(Document::affiche);
    }
}
