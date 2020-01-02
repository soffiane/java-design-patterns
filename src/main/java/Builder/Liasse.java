package Builder;

import java.util.ArrayList;
import java.util.List;

public abstract class Liasse {

    private List<String> contenu = new ArrayList<>();

    public abstract void ajouteDocument(String document);

    public abstract void imprime();

    public List<String> getContenu() {
        return contenu;
    }

    public void setContenu(List<String> contenu) {
        this.contenu = contenu;
    }
}
