package InterpreterPattern.Demo;

public class InterpreterPatternDemo {

    // Rule: Alex and Peter are male
    public static Expression getMaleExpression() {
        Expression alex = new TerminalExpression("Alex");
        Expression peter = new TerminalExpression("Peter");
        return new OrExpression(alex, peter);
    }

    // Rule: Noora is a married women
    public static Expression getMarriedWomanExpression() {
        Expression noora = new TerminalExpression("Noora");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(noora, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("Peter is male? " + isMale.interpret("Peter"));
        System.out.println("Noora is a married women? " + isMarriedWoman.interpret("Married Noora"));
    }
}