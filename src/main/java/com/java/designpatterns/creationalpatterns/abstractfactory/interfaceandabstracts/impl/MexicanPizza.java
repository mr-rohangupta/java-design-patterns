package com.java.designpatterns.creationalpatterns.abstractfactory.interfaceandabstracts.impl;

import com.java.designpatterns.creationalpatterns.abstractfactory.interfaceandabstracts.Pizza;

public class MexicanPizza extends Pizza {

    @Override
    public String addContent(String content) {
        return "Mexican Pizza and its ready for you with some extra " + getToppings() + " and " + content + " toppings..";
    }
}
