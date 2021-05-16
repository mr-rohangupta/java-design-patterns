package com.java.designpatterns.behaviorpattern.interpreterpattern.interfacesandabstracts.impl;

import com.java.designpatterns.behaviorpattern.interpreterpattern.interfacesandabstracts.Expression;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 15-05-2021
 * Time: 18:17
 */
public class MultiplicationExpression implements Expression {

    private final Expression firstExpression;
    private final Expression secondExpression;

    public MultiplicationExpression(Expression firstExpression, Expression secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpret() {
        return this.firstExpression.interpret() * this.secondExpression.interpret();
    }

    @Override
    public String toString() {
        return "*";
    }
}
