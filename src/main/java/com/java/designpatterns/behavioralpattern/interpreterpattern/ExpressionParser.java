package com.java.designpatterns.behavioralpattern.interpreterpattern;

import com.java.designpatterns.behavioralpattern.interpreterpattern.interfacesandabstracts.Expression;
import com.java.designpatterns.behavioralpattern.interpreterpattern.interfacesandabstracts.impl.NumberExpression;

import java.util.Stack;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 15-05-2021
 * Time: 18:27
 */
public class ExpressionParser {
    Stack<Expression> stack = new Stack();

    public int parse(String str) {
        String[] tokenList = str.split(" ");
        for (String symbol : tokenList) {
            if (!ParserUtil.isOperator(symbol)) {
                Expression numberExpression = new NumberExpression(symbol);
                stack.push(numberExpression);
                System.out.println(String.format("Pushed to stack: %d", numberExpression.interpret()));
            } else if (ParserUtil.isOperator(symbol)) {
                Expression firstExpression = stack.pop();
                Expression secondExpression = stack.pop();
                System.out.println(String.format("Poped operands %d and %d",
                        firstExpression.interpret(), secondExpression.interpret()));
                Expression operator = ParserUtil.getExpressionObject(firstExpression, secondExpression, symbol);
                System.out.println(String.format("Applying Operator: %s", operator));
                int result = operator.interpret();
                NumberExpression resultExpression = new NumberExpression(result);
                stack.push(resultExpression);
                System.out.println(String.format("Pushed result to stack: %d", resultExpression.interpret()));
            }
        }
        return stack.pop().interpret();
    }
}
