package com.java.designpatterns.structuralpattern.adapterpattern;

import com.java.designpatterns.structuralpattern.adapterpattern.adapter.CryptoToRupeeAdapter;
import com.java.designpatterns.structuralpattern.adapterpattern.interfacesandabstracts.IPayable;
import com.java.designpatterns.structuralpattern.adapterpattern.interfacesandabstracts.PayBill;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 15-05-2021
 * Time: 13:21
 */
public class Hotel {
    public static void main(String[] args) {
        //TODO This wont work here so we need adapter which convert the crypto to rupee
        //CryptoCurrency cryptoCurrency = new CryptoCurrency();

        IPayable cryptoCurrency = new CryptoToRupeeAdapter();
        PayBill payBill = new PayBill();
        payBill.setiPayable(cryptoCurrency);
        payBill.payBill("10000");

    }
}
