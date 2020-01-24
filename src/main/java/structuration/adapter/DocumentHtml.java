package structuration.adapter;

public class DocumentHtml implements Document {

    private String contenu;

    @Override
    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    @Override
    public void dessine() {
        System.out.println("Dessine document HTML : "+contenu);
    }

    @Override
    public void imprime() {
        System.out.println("Imprime document HTML : "+contenu);
    }
}
