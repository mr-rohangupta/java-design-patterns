package com.java.designpatterns.creationalpatterns.prototypepattern.interfacesandabstracts;

@FunctionalInterface
public interface OperatingSystem extends Cloneable{

    public OperatingSystem clone() throws CloneNotSupportedException;

}
