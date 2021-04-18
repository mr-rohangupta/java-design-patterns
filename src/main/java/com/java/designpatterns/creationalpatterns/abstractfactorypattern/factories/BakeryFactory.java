package com.java.designpatterns.creationalpatterns.abstractfactorypattern.factories;

import com.java.designpatterns.creationalpatterns.abstractfactorypattern.interfacesandabstracts.Bakery;
import com.java.designpatterns.creationalpatterns.abstractfactorypattern.interfacesandabstracts.Pizza;
import com.java.designpatterns.creationalpatterns.abstractfactorypattern.interfacesandabstracts.impl.AmazingBlazingBakers;
import com.java.designpatterns.creationalpatterns.abstractfactorypattern.interfacesandabstracts.impl.FantasticBakers;
import com.java.designpatterns.creationalpatterns.abstractfactorypattern.interfacesandabstracts.impl.SuperBakers;

public class BakeryFactory extends BakersPizzaAbstractFactory {
    @Override
    public Bakery getBakery(String bakeryName) {
        if(bakeryName == null)
        return null;

        if(bakeryName.equalsIgnoreCase("AmazingBlazingBakers")){
            return new AmazingBlazingBakers();
        }
        else if(bakeryName.equalsIgnoreCase("FantasticBakers")){
            return new FantasticBakers();
        }
        else if(bakeryName.equalsIgnoreCase("SuperBakers")){
            return new SuperBakers();
        }
        return null;
    }

    @Override
    public Pizza getPizza(String name) {
        return null;
    }
}
