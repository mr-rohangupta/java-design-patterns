package com.java.designpatterns.creationalpatterns.prototypepattern.interfacesandabstracts.impl;

import com.java.designpatterns.creationalpatterns.prototypepattern.interfacesandabstracts.OperatingSystem;

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
