package com.java.designpatterns.behaviorpattern.chainofresponsibilitypattern.interfacesandabstracts.impl;

import com.java.designpatterns.behaviorpattern.chainofresponsibilitypattern.interfacesandabstracts.ChainedCashDispenser;
import com.java.designpatterns.behaviorpattern.chainofresponsibilitypattern.interfacesandabstracts.Currency;

public class Cash2000RupeesDispenser implements ChainedCashDispenser {

    private ChainedCashDispenser chainedCashDispenser;

    @Override
    public void setNextChainedCashDispenser(ChainedCashDispenser nextChainedCashDispenser) {
        this.chainedCashDispenser = nextChainedCashDispenser;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 2000) {
            int num = currency.getAmount() / 2000;
            int remainder = currency.getAmount() % 2000;
            System.out.println("Dispensing " + num + "Notes of 2000 Rs");
            if (remainder != 0)
                this.chainedCashDispenser.dispense(new Currency(remainder));
            else
                this.chainedCashDispenser.dispense(currency);
        }
    }
}
