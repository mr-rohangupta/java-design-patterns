package com.java.designpatterns.structuralpattern.bridgepattern.abstraction;

import com.java.designpatterns.structuralpattern.bridgepattern.implementor.IPaymentSystem;

public abstract class Payment {

    public IPaymentSystem iPaymentSystem;

    public abstract void makePayment();
}
