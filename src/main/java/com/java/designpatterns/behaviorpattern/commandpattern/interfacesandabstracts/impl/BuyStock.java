package com.java.designpatterns.behaviorpattern.commandpattern.interfacesandabstracts.impl;

import com.java.designpatterns.behaviorpattern.commandpattern.interfacesandabstracts.Order;
import com.java.designpatterns.behaviorpattern.commandpattern.interfacesandabstracts.Stock;

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
