package com.java.designpatterns.creationalpatterns.abstractfactorypattern.interfaceandabstracts;

public abstract class Pizza {

    public final String toppings = "Cheeze";

    public String getToppings(){
        return toppings;
    }

    public abstract String addContent(String content);

}
