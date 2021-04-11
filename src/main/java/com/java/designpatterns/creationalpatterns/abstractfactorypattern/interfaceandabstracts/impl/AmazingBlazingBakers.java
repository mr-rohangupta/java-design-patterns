package com.java.designpatterns.creationalpatterns.abstractfactorypattern.interfaceandabstracts.impl;

import com.java.designpatterns.creationalpatterns.abstractfactorypattern.interfaceandabstracts.Bakery;

public class AmazingBlazingBakers implements Bakery {

    private final String bakeryName;

    public AmazingBlazingBakers() {
        bakeryName = "AmazingBlazingBakers";
    }

    @Override
    public String getBakeryName() {
        return bakeryName;
    }
}
