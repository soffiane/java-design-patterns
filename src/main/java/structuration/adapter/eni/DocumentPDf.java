package structuration.adapter.eni;

/**
 * DocumentPdf est l'adapteur
 * il implemente les methodes de l'interface Document
 * en invoquant les méthodes de l'objet adapté (ComposantPdf)
 */
public class DocumentPDf implements Document{
    //on instancie l'adapteur
    private ComposantPdf outilPdf = new ComposantPdf();

    //on utilise les methode de l'adapteur dans le code de l'adapté
    @Override
    public void setContenu(String contenu) {
        outilPdf.pdfFixeContenu(contenu);
    }

    @Override
    public void dessine() {
        outilPdf.pdfPrepareAffichage();
        outilPdf.pdfRafraichit();
        outilPdf.pdfTermineAffichage();
    }

    @Override
    public void imprime() {
        outilPdf.pdfEnvoiImprimante();
    }
}
