package structuration.proxy.eni;

/**
 * Le proxy
 */
public class AnimationProxy implements Animation {

    private Film film=null;
    private String photo = "affichage de la photo";

    @Override
    public void dessine() {
        if(film != null)
            film.dessine();
        else
            dessine(photo);

    }

    private void dessine(String photo) {
        System.out.println(photo);
    }

    @Override
    public void clic() {
        if(film == null){
            film = new Film();
            film.charge();
        }
        film.joue();
    }
}
