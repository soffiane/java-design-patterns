package construction.builder.Eni;

public class LiasseHtml extends Liasse {
    @Override
    public void ajouteDocument(String document) {
        if(document.startsWith("<HTML>")){
            getContenu().add(document);
        }
    }

    @Override
    public void imprime() {
        System.out.println("Liasse HTML");
        getContenu().forEach(System.out::println);
    }
}
