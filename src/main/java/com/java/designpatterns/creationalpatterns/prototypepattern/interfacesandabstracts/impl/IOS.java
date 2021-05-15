package com.java.designpatterns.creationalpatterns.prototypepattern.interfacesandabstracts.impl;

import com.java.designpatterns.creationalpatterns.prototypepattern.interfacesandabstracts.OperatingSystem;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 15-05-2021
 * Time: 13:21
 */
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
