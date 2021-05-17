package com.java.designpatterns.behavioralpattern.interpreterpattern.interfacesandabstracts.impl;

import com.java.designpatterns.behavioralpattern.interpreterpattern.interfacesandabstracts.Expression;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 15-05-2021
 * Time: 17:01
 */
public class NumberExpression implements Expression {
    private final int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    public NumberExpression(String number) {
        this.number = Integer.parseInt(number);
    }

    @Override
    public int interpret() {
        return this.number;
    }
}
