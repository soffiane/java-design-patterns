package comportement.interpreter.eni;

public class OperateurEt extends OperateurBinaire {

    public OperateurEt(Expression operandeGauche, Expression operandeDroite) {
        super(operandeGauche, operandeDroite);
    }

    @Override
    public boolean evalue(String expression) {
        return operandeDroite.evalue(expression) && operandeGauche.evalue(expression);
    }

    public static Expression parse() throws Exception {
        Expression resultatGauche = Expression.parse();
        Expression resultatDroite;
        while( jeton != null && jeton.equals("et")){
            prochainJeton();
            resultatDroite = OperateurEt.parse();
            resultatGauche = new OperateurEt(resultatGauche,resultatDroite);
        }
        return resultatGauche;
    }
}
