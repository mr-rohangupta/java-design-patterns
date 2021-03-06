package com.java.designpatterns.structuralpattern.bridgepattern;

import com.java.designpatterns.structuralpattern.bridgepattern.abstraction.Payment;
import com.java.designpatterns.structuralpattern.bridgepattern.concreteimplementor.IciciPaymentSystem;
import com.java.designpatterns.structuralpattern.bridgepattern.concreteimplementor.SbiPaymentSystem;
import com.java.designpatterns.structuralpattern.bridgepattern.refinedabstraction.CardPayment;
import com.java.designpatterns.structuralpattern.bridgepattern.refinedabstraction.NetBanking;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 15-05-2021
 * Time: 13:21
 */
public class BridgeDemo {

    public static void main(String[] args) {
        Payment order = new CardPayment();
        order.iPaymentSystem = new SbiPaymentSystem();
        order.makePayment();

        order.iPaymentSystem = new IciciPaymentSystem();
        order.makePayment();

        order = new NetBanking();
        order.iPaymentSystem = new IciciPaymentSystem();
        order.makePayment();
    }
}
