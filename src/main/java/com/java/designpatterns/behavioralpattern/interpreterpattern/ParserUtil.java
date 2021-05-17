package com.java.designpatterns.behavioralpattern.interpreterpattern;

import com.java.designpatterns.behavioralpattern.interpreterpattern.interfacesandabstracts.Expression;
import com.java.designpatterns.behavioralpattern.interpreterpattern.interfacesandabstracts.impl.AdditionExpression;
import com.java.designpatterns.behavioralpattern.interpreterpattern.interfacesandabstracts.impl.DivisionExpression;
import com.java.designpatterns.behavioralpattern.interpreterpattern.interfacesandabstracts.impl.MultiplicationExpression;
import com.java.designpatterns.behavioralpattern.interpreterpattern.interfacesandabstracts.impl.SubtractionExpression;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 15-05-2021
 * Time: 18:21
 */
public class ParserUtil {

    public static boolean isOperator(String symbol) {
        return (symbol.equals("+") || symbol.equals("-") || symbol.equals("*") || symbol.equals("/"));
    }

    public static Expression getExpressionObject(Expression firstExpression, Expression secondExpression, String symbol) {
        if (symbol.equals("+"))
            return new AdditionExpression(firstExpression, secondExpression);
        else if (symbol.equals("-"))
            return new SubtractionExpression(firstExpression, secondExpression);
        else if (symbol.equals("*"))
            return new MultiplicationExpression(firstExpression, secondExpression);
        else
            return new DivisionExpression(firstExpression, secondExpression);
    }
}
