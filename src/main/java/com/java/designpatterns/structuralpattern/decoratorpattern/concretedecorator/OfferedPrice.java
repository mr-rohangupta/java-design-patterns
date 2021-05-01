package com.java.designpatterns.structuralpattern.decoratorpattern.concretedecorator;

import com.java.designpatterns.structuralpattern.decoratorpattern.component.ICar;
import com.java.designpatterns.structuralpattern.decoratorpattern.decorator.CarDecorator;

public class OfferedPrice extends CarDecorator {

    public ICar iCar;

    public OfferedPrice(ICar iCar) {
        super(iCar);
        this.iCar = iCar;
    }

    @Override
    public double getDiscountedPrice() {
        return .8 * iCar.getPrice();
    }
}
