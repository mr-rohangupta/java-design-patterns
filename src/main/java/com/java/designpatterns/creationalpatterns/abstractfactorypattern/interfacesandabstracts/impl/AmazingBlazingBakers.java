package com.java.designpatterns.creationalpatterns.abstractfactorypattern.interfacesandabstracts.impl;

import com.java.designpatterns.creationalpatterns.abstractfactorypattern.interfacesandabstracts.Bakery;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 15-05-2021
 * Time: 13:21
 */
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
