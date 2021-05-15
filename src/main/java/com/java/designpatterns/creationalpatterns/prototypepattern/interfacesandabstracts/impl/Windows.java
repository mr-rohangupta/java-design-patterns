package com.java.designpatterns.creationalpatterns.prototypepattern.interfacesandabstracts.impl;

import com.java.designpatterns.creationalpatterns.prototypepattern.interfacesandabstracts.OperatingSystem;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 15-05-2021
 * Time: 13:21
 */
public class Windows implements OperatingSystem {

    @Override
    public Windows clone() throws CloneNotSupportedException {
        System.out.println("Cloning Windows Operating System..");
        return (Windows) super.clone();
    }

    @Override
    public String toString() {
        return "Windows"    ;
    }
}
