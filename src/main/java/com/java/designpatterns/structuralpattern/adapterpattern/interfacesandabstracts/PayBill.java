package com.java.designpatterns.structuralpattern.adapterpattern.interfacesandabstracts;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 15-05-2021
 * Time: 13:21
 */
public class PayBill {

    private IPayable iPayable;

    public IPayable getiPayable() {
        return iPayable;
    }

    public void setiPayable(IPayable iPayable) {
        this.iPayable = iPayable;
    }

    public void payBill(String amount) {
        iPayable.pay(amount);
    }
}
