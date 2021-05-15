package com.java.designpatterns.structuralpattern.adapterpattern.adapter;

import com.java.designpatterns.structuralpattern.adapterpattern.interfacesandabstracts.CryptoCurrency;
import com.java.designpatterns.structuralpattern.adapterpattern.interfacesandabstracts.IPayable;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 15-05-2021
 * Time: 13:21
 */
public class CryptoToRupeeAdapter implements IPayable {

    CryptoCurrency cryptoCurrency = new CryptoCurrency();


    @Override
    public void pay(String rupees) {
        cryptoCurrency.payInCrypto(rupees);
    }
}
