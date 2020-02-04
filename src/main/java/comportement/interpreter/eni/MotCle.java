package comportement.interpreter.eni;

public class MotCle extends Expression {
    private String motCle;

    public MotCle(String motCle) {
        this.motCle = motCle;
    }

    //on recherche le mot clé dans l'expression
    @Override
    public boolean evalue(String expression) {
        return expression.contains(motCle);
    }

    //analyse syntaxique
    public static Expression parse(){
        Expression resultat = new MotCle(jeton);
        prochainJeton();
        return resultat;
    }
}
