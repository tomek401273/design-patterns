package behavioral.interpreter.secound;

import behavioral.interpreter.Expression;
import behavioral.interpreter.TerminalExpression;

public class App {
    static Expression buildInterpretatorTree() {
        Expression termial = new TerminalExpression("Lions");
        return termial;
    }

    public static void main(String[] args) {
        String context = "Lions 3";
//        String context = "fgf Lions";
        Expression define = buildInterpretatorTree();
        System.out.println(context+" is "+define.interpret(context));

    }
}
