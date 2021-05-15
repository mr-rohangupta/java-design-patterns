package com.java.designpatterns.structuralpattern.decoratorpattern;

import com.java.designpatterns.structuralpattern.decoratorpattern.component.ICar;
import com.java.designpatterns.structuralpattern.decoratorpattern.concretecomponent.Kia;
import com.java.designpatterns.structuralpattern.decoratorpattern.concretecomponent.Nexa;
import com.java.designpatterns.structuralpattern.decoratorpattern.concretedecorator.OfferedPrice;
import com.java.designpatterns.structuralpattern.decoratorpattern.decorator.CarDecorator;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 15-05-2021
 * Time: 13:21
 */
public class DecoratorDemo {

    public static void main(String[] args) {
        CarDecorator carDecorator;
        ICar iCar = new Nexa();
        carDecorator = new OfferedPrice(iCar);
        System.out.println("Car Details ..........");
        System.out.println("------------------------------------------");
        System.out.println("The Name Of Your Car is " + carDecorator.name());
        System.out.println("The Model you selected is " + carDecorator.model());
        System.out.println("The Base Price of your Car is " + carDecorator.getPrice());
        System.out.println("Final Price After Discount is " + carDecorator.getDiscountedPrice());

        ICar car = new Kia();
        carDecorator = new OfferedPrice(car);
        System.out.println("------------------------------------------");
        System.out.println("The Name Of Your Car is " + carDecorator.name());
        System.out.println("The Model you selected is " + carDecorator.model());
        System.out.println("The Base Price of your Car is " + carDecorator.getPrice());
        System.out.println("Final Price After Discount is " + carDecorator.getDiscountedPrice());
    }
}
