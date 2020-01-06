package Prototype.Eni;

import java.util.List;

public abstract class Liasse {
    private List<Document> documents;

    public List<Document> getDocuments(){
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }
}
