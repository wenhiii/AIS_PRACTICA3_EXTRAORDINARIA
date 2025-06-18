package es.codeurjc.test;

public class InvalidExpression extends RuntimeException {
    public InvalidExpression(String message) {
        super(message);
    }
}