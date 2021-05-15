package com.java.designpatterns.creationalpatterns.abstractfactorypattern.factories;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 15-05-2021
 * Time: 13:21
 */
public class BakeryPizzaFactoryCreator {

    public static BakersPizzaAbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("Bakery")) {
            return new BakeryFactory();
        } else if (choice.equalsIgnoreCase("Pizza")) {
            return new PizzaFactory();
        }
        return null;
    }
}
