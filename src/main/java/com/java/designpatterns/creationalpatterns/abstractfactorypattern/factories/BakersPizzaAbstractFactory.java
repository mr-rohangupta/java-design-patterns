package com.java.designpatterns.creationalpatterns.abstractfactorypattern.factories;

import com.java.designpatterns.creationalpatterns.abstractfactorypattern.interfaceandabstracts.Bakery;
import com.java.designpatterns.creationalpatterns.abstractfactorypattern.interfaceandabstracts.Pizza;

public abstract class BakersPizzaAbstractFactory {

    public abstract Bakery getBakery(String name);

    public abstract Pizza getPizza(String name);

}