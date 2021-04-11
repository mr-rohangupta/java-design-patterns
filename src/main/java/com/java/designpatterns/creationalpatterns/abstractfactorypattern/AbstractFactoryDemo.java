package com.java.designpatterns.creationalpatterns.abstractfactorypattern;

import com.java.designpatterns.creationalpatterns.abstractfactorypattern.factories.BakersPizzaAbstractFactory;
import com.java.designpatterns.creationalpatterns.abstractfactorypattern.factories.BakeryPizzaFactoryCreator;
import com.java.designpatterns.creationalpatterns.abstractfactorypattern.interfaceandabstracts.Bakery;
import com.java.designpatterns.creationalpatterns.abstractfactorypattern.interfaceandabstracts.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbstractFactoryDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Bakery Name where you want to eat PIZZA we have three vendors AmazingBlazingBakers, FantasticBakers and SuperBakers..!!");
        String bakeryName = bufferedReader.readLine();
        System.out.println("Enter Type Of Pizza you want to eat we have three varieties MargheritaPizza, MexicanPizza and PaneerPizza..!!");
        String pizzaType = bufferedReader.readLine();
        System.out.println("Enter any other toppings you want to add..");
        String content = bufferedReader.readLine();
        BakersPizzaAbstractFactory bakeryFactory = BakeryPizzaFactoryCreator.getFactory("Bakery");
        Bakery bakery = bakeryFactory.getBakery(bakeryName);
        System.out.println("Great Choice You selected the bakery " + bakery.getBakeryName());
        BakersPizzaAbstractFactory pizzaFactory = BakeryPizzaFactoryCreator.getFactory("Pizza");
        Pizza pizza = pizzaFactory.getPizza(pizzaType);
        System.out.println("You Ordered " + pizza.addContent(content));
    }
}
