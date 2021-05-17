package com.java.designpatterns.behavioralpattern.commandpattern.interfacesandabstracts;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 15-05-2021
 * Time: 13:21
 */
public class Stock {

    public String stockName;
    public Integer numberOfShares;

    public Stock(String stockName, Integer numberOfShares) {
        this.stockName = stockName;
        this.numberOfShares = numberOfShares;
    }

    public void buy() {
        System.out.println("You Purchase " + numberOfShares + " shares of " + stockName);
    }

    public void sell() {
        System.out.println("You Sold " + numberOfShares + " shares of " + stockName);
    }
}
