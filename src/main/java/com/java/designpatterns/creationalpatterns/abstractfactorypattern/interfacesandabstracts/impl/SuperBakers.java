package com.java.designpatterns.creationalpatterns.abstractfactorypattern.interfacesandabstracts.impl;

import com.java.designpatterns.creationalpatterns.abstractfactorypattern.interfacesandabstracts.Bakery;

public class SuperBakers implements Bakery {

    private final String bakeryName;

    public SuperBakers() {
        bakeryName = "SuperBakers";
    }

    @Override
    public String getBakeryName() {
        return bakeryName;
    }
}
