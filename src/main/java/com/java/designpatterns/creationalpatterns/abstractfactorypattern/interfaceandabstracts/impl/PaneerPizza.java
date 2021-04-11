package com.java.designpatterns.creationalpatterns.abstractfactorypattern.interfaceandabstracts.impl;

import com.java.designpatterns.creationalpatterns.abstractfactorypattern.interfaceandabstracts.Pizza;

public class PaneerPizza extends Pizza {
    @Override
    public String addContent(String content) {
        return "Paneer Pizza and its ready for you with some extra " + getToppings() + " and " + content + " toppings..";
    }
}
