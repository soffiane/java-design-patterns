package structuration.adapter.eni;

public class ServeurHtml {
    public static void main(String[] args){
        Document documentHtml = new DocumentHtml();
        Document documentPdf = new DocumentPDf();

        documentHtml.setContenu("Hello");
        documentHtml.dessine();
        documentHtml.imprime();
        //meme methodes car meme interface mais les methodes pour le PDF appellent
        //les methodes de l'adapteur ComposantPdf
        documentPdf.setContenu("Hello");
        documentPdf.dessine();
        documentPdf.imprime();
    }
}
