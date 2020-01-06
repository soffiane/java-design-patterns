package construction.prototype.Eni;

import lombok.Getter;

import java.util.Optional;

@Getter
public abstract class Document implements Cloneable {

    private String contenu;

    public Optional<Document> duplique() {
        Document document;
        try {
            document = (Document) this.clone();
        } catch (CloneNotSupportedException e) {
            return Optional.empty();
        }
        return Optional.of(document);
    }

    public void remplir(String informations){
        contenu = informations;
    }

    public abstract void imprime();
    public abstract void affiche();
}
