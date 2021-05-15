package com.java.designpatterns.structuralpattern.bridgepattern.concreteimplementor;

import com.java.designpatterns.structuralpattern.bridgepattern.implementor.IPaymentSystem;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 15-05-2021
 * Time: 13:21
 */
public class IciciPaymentSystem implements IPaymentSystem {

    @Override
    public void processPayment(String paymentSystem) {
        System.out.println("Using Icici gateway for " + paymentSystem);
    }
}
