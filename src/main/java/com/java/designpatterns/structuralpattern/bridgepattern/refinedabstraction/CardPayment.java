package com.java.designpatterns.structuralpattern.bridgepattern.refinedabstraction;

import com.java.designpatterns.structuralpattern.bridgepattern.abstraction.Payment;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 15-05-2021
 * Time: 13:21
 */
public class CardPayment extends Payment {
    @Override
    public void makePayment() {
        iPaymentSystem.processPayment("Card Payment");
    }
}
