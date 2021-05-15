package com.java.designpatterns.creationalpatterns.prototypepattern.interfacesandabstracts.impl;

import com.java.designpatterns.creationalpatterns.prototypepattern.interfacesandabstracts.OperatingSystem;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 15-05-2021
 * Time: 13:21
 */
public class Ubuntu implements OperatingSystem {

    @Override
    public Ubuntu clone() throws CloneNotSupportedException {
        System.out.println("Cloning Ubuntu Operating System..");
        return (Ubuntu) super.clone();
    }

    @Override
    public String toString() {
        return "ubuntu";
    }
}
