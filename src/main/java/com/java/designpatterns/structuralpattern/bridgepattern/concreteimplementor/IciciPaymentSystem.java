package com.java.designpatterns.structuralpattern.bridgepattern.concreteimplementor;

import com.java.designpatterns.structuralpattern.bridgepattern.implementor.IPaymentSystem;

public class IciciPaymentSystem implements IPaymentSystem {

    @Override
    public void processPayment(String paymentSystem) {
        System.out.println("Using Icici gateway for " + paymentSystem);
    }
}
