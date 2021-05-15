package com.java.designpatterns.creationalpatterns.abstractfactorypattern.interfacesandabstracts;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 15-05-2021
 * Time: 13:21
 */
public abstract class Pizza {

    public final String toppings = "Cheeze";

    public String getToppings() {
        return toppings;
    }

    public abstract String addContent(String content);

}
