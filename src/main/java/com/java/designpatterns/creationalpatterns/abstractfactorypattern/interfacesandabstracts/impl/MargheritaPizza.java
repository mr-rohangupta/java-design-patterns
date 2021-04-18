package com.java.designpatterns.creationalpatterns.abstractfactorypattern.interfacesandabstracts.impl;

import com.java.designpatterns.creationalpatterns.abstractfactorypattern.interfacesandabstracts.Pizza;

public class MargheritaPizza extends Pizza {

    @Override
    public String addContent(String content) {
        return "Margherita Pizza and its ready for you with some extra " + getToppings() + " and " + content + " toppings..";
    }
}