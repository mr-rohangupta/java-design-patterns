package com.java.designpatterns.structuralpattern.proxypattern;

import com.java.designpatterns.structuralpattern.proxypattern.interfacesandabstracts.Image;
import com.java.designpatterns.structuralpattern.proxypattern.interfacesandabstracts.impl.ProxyImage;

public class ProxyDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("windmill.jpeg");

        //Image will be loaded from disk
        image.display();

        //image will not be loaded from disk
        image.display();
    }
}
