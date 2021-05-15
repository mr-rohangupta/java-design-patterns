package com.java.designpatterns.creationalpatterns.abstractfactorypattern.interfacesandabstracts.impl;

import com.java.designpatterns.creationalpatterns.abstractfactorypattern.interfacesandabstracts.Pizza;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 15-05-2021
 * Time: 13:21
 */
public class MargheritaPizza extends Pizza {

    @Override
    public String addContent(String content) {
        return "Margherita Pizza and its ready for you with some extra " + getToppings() + " and " + content + " toppings..";
    }
}
