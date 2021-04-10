package com.java.designpatterns.creationalpatterns.abstractfactory.factories;

import com.java.designpatterns.creationalpatterns.abstractfactory.interfaceandabstracts.Bakery;
import com.java.designpatterns.creationalpatterns.abstractfactory.interfaceandabstracts.Pizza;

public abstract class BakersPizzaAbstractFactory {

    public abstract Bakery getBakery(String name);

    public abstract Pizza getPizza(String name);

}
