package com.java.designpatterns.creationalpatterns.prototypepattern.interfacesandabstracts.impl;

import com.java.designpatterns.creationalpatterns.prototypepattern.interfacesandabstracts.OperatingSystem;

public class IOS implements OperatingSystem {

    @Override
    public IOS clone() throws CloneNotSupportedException {
        System.out.println("Cloning IOS Operating System..");
        return (IOS) super.clone();
    }

    @Override
    public String toString() {
        return "IOS";
    }
}