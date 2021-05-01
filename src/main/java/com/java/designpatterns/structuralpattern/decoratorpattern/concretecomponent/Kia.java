package com.java.designpatterns.structuralpattern.decoratorpattern.concretecomponent;

import com.java.designpatterns.structuralpattern.decoratorpattern.component.ICar;

public final class Kia implements ICar {

    @Override
    public String name() {
        return "Kia";
    }

    @Override
    public String model() {
        return "Sedan";
    }

    @Override
    public double getPrice() {
        return 1500000d;
    }
}
