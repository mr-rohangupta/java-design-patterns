package com.java.designpatterns.structuralpattern.bridgepattern.abstraction;

import com.java.designpatterns.structuralpattern.bridgepattern.implementor.IPaymentSystem;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 15-05-2021
 * Time: 13:21
 */
public abstract class Payment {

    public IPaymentSystem iPaymentSystem;

    public abstract void makePayment();
}
