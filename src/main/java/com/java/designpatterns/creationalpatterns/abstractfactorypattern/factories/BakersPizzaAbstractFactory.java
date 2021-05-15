package com.java.designpatterns.creationalpatterns.abstractfactorypattern.factories;

import com.java.designpatterns.creationalpatterns.abstractfactorypattern.interfacesandabstracts.Bakery;
import com.java.designpatterns.creationalpatterns.abstractfactorypattern.interfacesandabstracts.Pizza;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 15-05-2021
 * Time: 13:21
 */
public abstract class BakersPizzaAbstractFactory {

    public abstract Bakery getBakery(String name);

    public abstract Pizza getPizza(String name);

}
