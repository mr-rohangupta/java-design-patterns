package com.java.designpatterns.structuralpattern.proxypattern.interfacesandabstracts.impl;

import com.java.designpatterns.structuralpattern.proxypattern.interfacesandabstracts.Image;

public class RealImage implements Image {

    private final String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying Image " + fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }
}
