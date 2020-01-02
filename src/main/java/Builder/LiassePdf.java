package Builder;

public class LiassePdf extends Liasse{
    @Override
    public void ajouteDocument(String document) {
        if(document.startsWith("<PDF>")){
            getContenu().add(document);
        }
    }

    @Override
    public void imprime() {
        System.out.println("Liasse PDF");
        getContenu().forEach(System.out::println);
    }
}
