package behavioral.interpreter.ex;

import java.util.StringTokenizer;

public class TerminalExpresion implements Experesion {

   private String inputData;

    public TerminalExpresion(String inputData) {
        this.inputData = inputData;
    }

    @Override
    public boolean sayWhatToDo(String word) {
        StringTokenizer stringTokenizer = new StringTokenizer(word);
        while (stringTokenizer.hasMoreTokens()) {
            String token = stringTokenizer.nextToken();
            if (token.equals(inputData)) {
                return true;
            }
        }

        return false;
    }
}
