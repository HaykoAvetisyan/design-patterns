package behavioral.interpreter;

public class InterpreterRunner {
    public static void main(String[] args) {
        Expression isJava = getJavaExpression();
        Expression isJavaEEE = getJavaEEExpresion();

        System.out.println();



    }

    public static Expression getJavaExpression(){
        Expression java = new TerminalExpression("Java");
        Expression javaCore = new TerminalExpression("Java Core");
        return new OrExpression(java,javaCore);
    }

    public static Expression getJavaEEExpresion(){
        Expression java = new TerminalExpression("Java");
        Expression spring = new TerminalExpression("Spring");

        return new AndExpression(java,spring);
    }
}
