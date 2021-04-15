package com.java.designpatterns.creationalpatterns.builderpattern;

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
