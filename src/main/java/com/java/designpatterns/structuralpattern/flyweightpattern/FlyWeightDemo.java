package com.java.designpatterns.structuralpattern.flyweightpattern;

import com.java.designpatterns.structuralpattern.flyweightpattern.factory.VehicleFactory;
import com.java.designpatterns.structuralpattern.flyweightpattern.interfacesandabstracts.Vehicle;

import java.awt.*;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 15-05-2021
 * Time: 13:21
 */
public class FlyWeightDemo {

    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.createVehicle(Color.BLACK);
        vehicle.start();
        vehicle.stop();
        vehicle.getColor();

        Vehicle vehicle1 = VehicleFactory.createVehicle(Color.BLACK);
        vehicle1.start();
        vehicle1.stop();
        vehicle1.getColor();

        System.out.println(vehicle.equals(vehicle1));
    }
}
