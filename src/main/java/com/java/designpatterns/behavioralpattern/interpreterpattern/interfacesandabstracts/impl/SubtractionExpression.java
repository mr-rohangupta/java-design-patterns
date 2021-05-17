package com.java.designpatterns.behavioralpattern.interpreterpattern.interfacesandabstracts.impl;

import com.java.designpatterns.behavioralpattern.interpreterpattern.interfacesandabstracts.Expression;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 15-05-2021
 * Time: 17:10
 */
public class SubtractionExpression implements Expression {

    private final Expression firstExpression;
    private final Expression secondExpression;

    public SubtractionExpression(Expression firstExpression, Expression secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpret() {
        return this.firstExpression.interpret() - this.secondExpression.interpret();
    }

    @Override
    public String toString() {
        return "-";
    }
}
