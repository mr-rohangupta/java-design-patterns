package com.java.designpatterns.behaviorpattern.chainofresponsibilitypattern.interfacesandabstracts;

public class Currency {

    public int amount;

    public Currency(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return this.amount;
    }
}
