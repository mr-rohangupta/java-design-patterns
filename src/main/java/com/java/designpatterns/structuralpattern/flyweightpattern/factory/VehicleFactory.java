package com.java.designpatterns.structuralpattern.flyweightpattern.factory;

import com.java.designpatterns.structuralpattern.flyweightpattern.interfacesandabstracts.Engine;
import com.java.designpatterns.structuralpattern.flyweightpattern.interfacesandabstracts.Vehicle;
import com.java.designpatterns.structuralpattern.flyweightpattern.interfacesandabstracts.impl.Car;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 15-05-2021
 * Time: 13:21
 */
public class VehicleFactory {

    public static Map<Color, Vehicle> vehiclesCache = new HashMap<>();

    private VehicleFactory() {

    }

    public static Vehicle createVehicle(Color color) {
        Vehicle newVehicle = vehiclesCache.computeIfAbsent(color, newColor -> {
            Engine newEngine = new Engine();
            return new Car(newEngine, newColor);
        });
        return newVehicle;
    }
}
