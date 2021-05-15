package com.java.designpatterns.structuralpattern.flyweightpattern.interfacesandabstracts.impl;

import com.java.designpatterns.structuralpattern.flyweightpattern.interfacesandabstracts.Engine;
import com.java.designpatterns.structuralpattern.flyweightpattern.interfacesandabstracts.Vehicle;

import java.awt.*;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 15-05-2021
 * Time: 13:21
 */
public class Car implements Vehicle {

    private final Engine engine;

    private final Color color;

    public Car(Engine engine, Color color) {
        this.engine = engine;
        this.color = color;

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void start() {
        System.out.println("Car is Starting ..!!");
        engine.start();
    }

    @Override
    public void stop() {
        System.out.println("Car is Stopping ..!!");
        engine.stop();
    }

    @Override
    public Color getColor() {
        return this.color;
    }
}
