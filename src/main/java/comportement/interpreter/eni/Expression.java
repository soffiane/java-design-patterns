package comportement.interpreter.eni;

public abstract class Expression {

    protected static String source;
    protected static int index;
    protected static String jeton;

    public abstract boolean evalue(String expression);

    protected static void prochainJeton(){
        while(index < source.length() && source.charAt(index) == ' '){
            index++;
            if(index == source.length()){
                jeton = null;
            } else if(source.charAt(index) == '(' || source.charAt(index) == ')'){
                jeton = source.substring(index,index+1);
                index++;
            } else {
                int debut = index;
                while(index < source.length() && source.charAt(index) != ' ' && source.charAt(index) != ')'){
                    index++;
                    jeton = source.substring(debut,index);
                }
            }
        }
    }

    /**
     * analyse une expression entiere
     * @param source
     * @return
     */
    public static Expression analyse(String source) throws Exception {
        Expression.source = source;
        index = 0;
        prochainJeton();
        return OperateurOu.parse();
    }

    /**
     * Analyse d'un mot clé
     * @return
     */
    public static Expression parse() throws Exception {
        Expression resultat;
        //parenthese ouvrante = debut de l'expression "ou"
        if(jeton != null && jeton.equals("(")){
            prochainJeton();
            resultat = OperateurOu.parse();
            if(jeton == null || !jeton.equals(")")){
                throw new Exception("Erreur de syntaxe");
            }
            prochainJeton();
        } else {
            resultat = MotCle.parse();
        }
        return resultat;
    }
}
