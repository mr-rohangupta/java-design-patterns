package com.java.designpatterns.structuralpattern.decoratorpattern.decorator;

import com.java.designpatterns.structuralpattern.decoratorpattern.component.ICar;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 15-05-2021
 * Time: 13:21
 */
public abstract class CarDecorator implements ICar {

    private final ICar iCar;

    public CarDecorator(ICar iCar) {
        this.iCar = iCar;
    }

    public String model() {
        return iCar.model();
    }

    @Override
    public String name() {
        return iCar.name();
    }

    @Override
    public double getPrice() {
        return iCar.getPrice();
    }

    public abstract double getDiscountedPrice();
}
