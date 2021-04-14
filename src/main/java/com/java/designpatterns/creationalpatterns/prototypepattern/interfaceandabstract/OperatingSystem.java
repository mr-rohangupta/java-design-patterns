package com.java.designpatterns.creationalpatterns.prototypepattern.interfaceandabstract;

@FunctionalInterface
public interface OperatingSystem extends Cloneable{

    public OperatingSystem clone() throws CloneNotSupportedException;

}
