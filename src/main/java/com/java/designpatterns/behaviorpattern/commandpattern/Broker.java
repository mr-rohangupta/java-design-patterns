package com.java.designpatterns.behaviorpattern.commandpattern;

import com.java.designpatterns.behaviorpattern.commandpattern.interfacesandabstracts.Order;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 15-05-2021
 * Time: 13:21
 */
public class Broker {

    private final List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
