package com.java.designpatterns.structuralpattern.bridgepattern.refinedabstraction;

import com.java.designpatterns.structuralpattern.bridgepattern.abstraction.Payment;

public class NetBanking extends Payment {
    @Override
    public void makePayment() {
        iPaymentSystem.processPayment("Net Banking Payment");
    }
}
