package com.java.designpatterns.behaviorpattern.interpreterpattern;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 15-05-2021
 * Time: 18:45
 */
public class InterpreterDemo {
    public static void main(String[] args) {
        String input = "3 3 3 + *";
        ExpressionParser expressionParser = new ExpressionParser();
        int result = expressionParser.parse(input);
        System.out.println("Final Result: " + result);
    }
}
