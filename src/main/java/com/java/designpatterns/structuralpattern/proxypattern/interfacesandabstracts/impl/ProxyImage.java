package com.java.designpatterns.structuralpattern.proxypattern.interfacesandabstracts.impl;

import com.java.designpatterns.structuralpattern.proxypattern.interfacesandabstracts.Image;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 15-05-2021
 * Time: 13:21
 */
public class ProxyImage implements Image {

    private final String fileName;
    private RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
