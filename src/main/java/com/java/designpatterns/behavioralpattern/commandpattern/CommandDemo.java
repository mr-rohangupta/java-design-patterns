package com.java.designpatterns.behavioralpattern.commandpattern;

import com.java.designpatterns.behavioralpattern.commandpattern.interfacesandabstracts.Stock;
import com.java.designpatterns.behavioralpattern.commandpattern.interfacesandabstracts.impl.BuyStock;
import com.java.designpatterns.behavioralpattern.commandpattern.interfacesandabstracts.impl.SellStock;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 15-05-2021
 * Time: 13:21
 */
public class CommandDemo {
    public static void main(String[] args) {
        Stock stockToBuy = new Stock("MRF", 100000);
        Stock stockToSell = new Stock("MRF", 500);
        BuyStock buyStock = new BuyStock(stockToBuy);
        SellStock sellStock = new SellStock(stockToSell);

        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);
        broker.placeOrders();
    }
}
