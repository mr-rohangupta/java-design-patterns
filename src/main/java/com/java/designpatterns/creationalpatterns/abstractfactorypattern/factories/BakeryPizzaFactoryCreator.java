package com.java.designpatterns.creationalpatterns.abstractfactorypattern.factories;

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
