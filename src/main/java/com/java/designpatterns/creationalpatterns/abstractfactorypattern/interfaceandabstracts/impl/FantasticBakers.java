package com.java.designpatterns.creationalpatterns.abstractfactorypattern.interfaceandabstracts.impl;

import com.java.designpatterns.creationalpatterns.abstractfactorypattern.interfaceandabstracts.Bakery;

public class FantasticBakers implements Bakery {

    private final String bakeryName;

    public FantasticBakers() {
        bakeryName = "FantasticBakers";
    }

    @Override
    public String getBakeryName() {
        return bakeryName;
    }
}
