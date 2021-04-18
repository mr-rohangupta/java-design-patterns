package com.java.designpatterns.creationalpatterns.abstractfactorypattern.factories;

import com.java.designpatterns.creationalpatterns.abstractfactorypattern.interfacesandabstracts.Bakery;
import com.java.designpatterns.creationalpatterns.abstractfactorypattern.interfacesandabstracts.Pizza;
import com.java.designpatterns.creationalpatterns.abstractfactorypattern.interfacesandabstracts.impl.MargheritaPizza;
import com.java.designpatterns.creationalpatterns.abstractfactorypattern.interfacesandabstracts.impl.MexicanPizza;
import com.java.designpatterns.creationalpatterns.abstractfactorypattern.interfacesandabstracts.impl.PaneerPizza;

public class PizzaFactory extends BakersPizzaAbstractFactory {

    @Override
    public Bakery getBakery(String name) {
        return null;
    }

    @Override
    public Pizza getPizza(String pizzaName) {
        if (pizzaName == null)
            return null;

        if (pizzaName.equalsIgnoreCase("PaneerPizza")) {
            return new PaneerPizza();
        }
        if (pizzaName.equalsIgnoreCase("MexicanPizza")) {
            return new MexicanPizza();
        }
        if (pizzaName.equalsIgnoreCase("MergheritaPizza")) {
            return new MargheritaPizza();
        }
        return null;
    }
}
