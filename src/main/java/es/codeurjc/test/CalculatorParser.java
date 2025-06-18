package es.codeurjc.test;

public class CalculatorParser {
    public int parse(String expression) {
        if (expression.matches("^[a-zA-Z]+$")) {
            throw new InvalidExpression("Invalid Expression");
        }
        String[] parts = expression.split(" \\+ ");
        int sum = 0;
        try {
            for (String part : parts) {
                sum += Integer.parseInt(part.trim());
            }
        } catch (NumberFormatException e) {
            throw new InvalidExpression("Invalid Expression");
        }
        return sum;
    }
}
