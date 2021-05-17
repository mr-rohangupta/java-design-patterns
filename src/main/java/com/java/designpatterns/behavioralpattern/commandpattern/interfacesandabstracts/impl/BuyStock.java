package com.java.designpatterns.behavioralpattern.commandpattern.interfacesandabstracts.impl;

import com.java.designpatterns.behavioralpattern.commandpattern.interfacesandabstracts.Order;
import com.java.designpatterns.behavioralpattern.commandpattern.interfacesandabstracts.Stock;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 15-05-2021
 * Time: 13:21
 */
public class BuyStock implements Order {

    private final Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
