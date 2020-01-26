package structuration.facade.eni;

public class ComposantGestionDocument implements GestionDocument {
    @Override
    public String document(int index) {
        return "Document numero : "+index;
    }
}
