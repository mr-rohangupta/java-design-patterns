package com.java.designpatterns.behaviorpattern.chainofresponsibilitypattern.interfacesandabstracts.impl;

import com.java.designpatterns.behaviorpattern.chainofresponsibilitypattern.interfacesandabstracts.ChainedCashDispenser;
import com.java.designpatterns.behaviorpattern.chainofresponsibilitypattern.interfacesandabstracts.Currency;

public class Cash100RupeesDispenser implements ChainedCashDispenser {

    private ChainedCashDispenser chainedCashDispenser;

    @Override
    public void setNextChainedCashDispenser(ChainedCashDispenser nextChainedCashDispenser) {
        this.chainedCashDispenser = nextChainedCashDispenser;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 100) {
            int num = currency.getAmount() / 100;
            int remainder = currency.getAmount() % 100;
            System.out.println("Dispensing " + num + "Notes of 100Rs ");
        }
    }
}
