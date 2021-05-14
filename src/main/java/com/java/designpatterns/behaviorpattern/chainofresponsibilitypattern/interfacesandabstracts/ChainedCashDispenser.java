package com.java.designpatterns.behaviorpattern.chainofresponsibilitypattern.interfacesandabstracts;

public interface ChainedCashDispenser {

    void setNextChainedCashDispenser(ChainedCashDispenser nextChainedCashDispenser);

    void dispense(Currency currency);
}
