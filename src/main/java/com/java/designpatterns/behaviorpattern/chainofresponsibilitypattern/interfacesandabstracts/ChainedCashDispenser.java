package com.java.designpatterns.behaviorpattern.chainofresponsibilitypattern.interfacesandabstracts;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 15-05-2021
 * Time: 13:21
 */
public interface ChainedCashDispenser {

    void setNextChainedCashDispenser(ChainedCashDispenser nextChainedCashDispenser);

    void dispense(Currency currency);
}
