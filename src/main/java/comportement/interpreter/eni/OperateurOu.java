package comportement.interpreter.eni;

public class OperateurOu extends OperateurBinaire {

    public OperateurOu(Expression operandeGauche, Expression operandeDroite) {
        super(operandeGauche, operandeDroite);
    }

    @Override
    public boolean evalue(String expression) {
        return operandeDroite.evalue(expression) || operandeGauche.evalue(expression);
    }

    public static Expression parse() throws Exception {
        Expression resultatGauche = OperateurEt.parse();
        Expression resultatDroite;
        while( jeton != null && jeton.equals("ou")){
            prochainJeton();
            resultatDroite = OperateurEt.parse();
            resultatGauche = new OperateurOu(resultatGauche,resultatDroite);
        }
        return resultatGauche;
    }
}
