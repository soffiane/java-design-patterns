package comportement.interpreter.eni;

public abstract class OperateurBinaire extends Expression {
    protected Expression operandeGauche;
    protected Expression operandeDroite;

    public OperateurBinaire(Expression operandeGauche, Expression operandeDroite) {
        this.operandeGauche = operandeGauche;
        this.operandeDroite = operandeDroite;
    }
}
