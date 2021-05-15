package com.java.designpatterns.creationalpatterns.prototypepattern.interfacesandabstracts;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 15-05-2021
 * Time: 13:21
 */
@FunctionalInterface
public interface OperatingSystem extends Cloneable{

    public OperatingSystem clone() throws CloneNotSupportedException;

}
