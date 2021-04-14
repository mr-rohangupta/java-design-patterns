package com.java.designpatterns.creationalpatterns.prototypepattern.interfaceandabstract.impl;

import com.java.designpatterns.creationalpatterns.prototypepattern.interfaceandabstract.OperatingSystem;

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
