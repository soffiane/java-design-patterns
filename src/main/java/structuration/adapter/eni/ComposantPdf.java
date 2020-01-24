package structuration.adapter.eni;

/**
 * ComposantPdf introduit l'objet dont l'interface doit etre adaptée
 * pour correspondre à l'interface Document
 * Cette classe est independante de l'interface Document
 */
public class ComposantPdf {
    private String contenu;

    public void pdfFixeContenu(String contenu){
        this.contenu = contenu;
    }

    public void pdfPrepareAffichage(){
        System.out.println("Affichage PDF : "+contenu);
    }

    public void pdfRafraichit(){
        System.out.println("Affiche contenu PDF : "+contenu);
    }

    public void pdfTermineAffichage(){
        System.out.println("Affichage PDF : Fin");
    }

    public void pdfEnvoiImprimante(){
        System.out.println("Impression PDF : "+contenu);
    }

}
