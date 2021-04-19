package com.java.designpatterns.structuralpattern.adapterpattern.interfacesandabstracts;

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
