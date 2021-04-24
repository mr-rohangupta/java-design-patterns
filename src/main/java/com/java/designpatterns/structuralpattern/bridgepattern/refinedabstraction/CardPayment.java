package com.java.designpatterns.structuralpattern.bridgepattern.refinedabstraction;

import com.java.designpatterns.structuralpattern.bridgepattern.abstraction.Payment;

public class CardPayment extends Payment {
    @Override
    public void makePayment() {
        iPaymentSystem.processPayment("Card Payment");
    }
}
