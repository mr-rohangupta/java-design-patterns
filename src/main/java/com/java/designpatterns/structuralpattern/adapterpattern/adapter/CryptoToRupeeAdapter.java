package com.java.designpatterns.structuralpattern.adapterpattern.adapter;

import com.java.designpatterns.structuralpattern.adapterpattern.interfacesandabstracts.CryptoCurrency;
import com.java.designpatterns.structuralpattern.adapterpattern.interfacesandabstracts.IPayable;

public class CryptoToRupeeAdapter implements IPayable {

    CryptoCurrency cryptoCurrency = new CryptoCurrency();


    @Override
    public void pay(String rupees) {
        cryptoCurrency.payInCrypto(rupees);
    }
}
