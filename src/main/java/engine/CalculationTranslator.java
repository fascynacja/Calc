package engine;

import java.util.List;

public class CalculationTranslator {

    public Calculation translate(List<String> userInput) {

        //final Calculation calculation = new Calculation();

        final int number1 = Integer.parseInt(userInput.get(0));
        final int number2 = Integer.parseInt(userInput.get(2));
        final String operationString = userInput.get(1);

        Operation op = null;

        if (operationString.equals("/")) {
            op = Operation.DIVIDE;

        } else if (operationString.equals("+")) {
            op = Operation.PLUS;
            System.out.println(op);
        } else if (operationString.equals("-")) {
            op = Operation.MINUS;
            System.out.println(op);
        } else if (operationString.equals("*")) {
            op = Operation.MULTIPLY;
            System.out.println(op);
        }
        // calculation.setOperation(op);
        final Calculation calculation = new Calculation(op, number1, number2);

        return calculation;
    }
}
