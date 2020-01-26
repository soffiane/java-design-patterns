package structuration.facade.eni;

public class UtilisateurWebService {

    public static void main(String[] args){
        //interface client
        WebServiceAuto webServiceAuto = new WebServiceImpl();
        System.out.println(webServiceAuto.document(0));
        System.out.println(webServiceAuto.document(1));

        webServiceAuto.chercheVehicule(6000,1000).forEach(System.out::println);
    }
}
