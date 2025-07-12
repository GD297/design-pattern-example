package com.dinhgt.pattern.behavioral.interpreter;

public class Main {
    public static void main(String[] args) {
        Expression expression = new PlusExpression(new NumberExpression(1), new PlusExpression(new NumberExpression(2), new NumberExpression(3)));
        System.out.println("Result: " + expression.interpret());
    }
}
