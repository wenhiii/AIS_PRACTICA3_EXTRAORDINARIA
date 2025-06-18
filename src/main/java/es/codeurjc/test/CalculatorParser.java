package es.codeurjc.test;

public class CalculatorParser {
    public int parse(String expression) {
        String[] tokens = expression.split(" ");
            int result;
            try {
                result = Integer.parseInt(tokens[0].trim());
            } catch (NumberFormatException e) {
                throw new InvalidExpression("Invalid Expression");
            }

            for (int i = 1; i < tokens.length; i += 2) {
                String op = tokens[i];
                int num;
                try {
                    num = Integer.parseInt(tokens[i + 1].trim());
                } catch (NumberFormatException e) {
                    throw new InvalidExpression("Invalid Expression");
                }

                if (op.equals("+")) {
                    result += num;
                } else if (op.equals("-")) {
                    result -= num;
                } else {
                    throw new InvalidExpression("Invalid Expression");
                }
            }

            return result;
        }

}
