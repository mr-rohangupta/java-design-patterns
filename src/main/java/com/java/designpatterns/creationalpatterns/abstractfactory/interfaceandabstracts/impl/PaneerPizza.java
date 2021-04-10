package com.java.designpatterns.creationalpatterns.abstractfactory.interfaceandabstracts.impl;

import com.java.designpatterns.creationalpatterns.abstractfactory.interfaceandabstracts.Pizza;

public class PaneerPizza extends Pizza {
    @Override
    public String addContent(String content) {
        return "Paneer Pizza and its ready for you with some extra " + getToppings() + " and " + content + " toppings..";
    }
}
