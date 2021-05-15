package com.java.designpatterns.creationalpatterns.builderpattern;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan Gupta
 * Date: 15-05-2021
 * Time: 13:21
 */
public class BuilderDemo {

    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder("Garlic Base")
                .addTopping("Organo")
                .withCheeseType("Mozerilla")
                .atRate(560.0)
                .atBranch("Dominos Sadar")
                .build();
        System.out.println(pizza.toString());
    }
}
