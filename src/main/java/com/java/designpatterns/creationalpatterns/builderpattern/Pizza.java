package com.java.designpatterns.creationalpatterns.builderpattern;

public class Pizza {

    private final String pizzaBase;
    private final String topping;
    private final String cheeseType;
    private final double rate;
    private final String branch;

    private Pizza(Builder builder) {
        this.pizzaBase = builder.pizzaBase;
        this.topping = builder.topping;
        this.cheeseType = builder.cheeseType;
        this.rate = builder.rate;
        this.branch = builder.branch;
    }

    @Override
    public String toString() {
        return "Pizza ready for you with " + this.pizzaBase + "," +
                " toppings of " + this.topping + ", " +
                "and with some extra " + this.cheeseType + "Cheese , " +
                " at a Special rate of " + this.rate + ", " +
                "and at branch of " + this.branch;
    }

    public static class Builder {
        private final String pizzaBase;
        private String topping;
        private String cheeseType;
        private double rate;
        private String branch;

        public Builder(String pizzaBase) {
            this.pizzaBase = pizzaBase;
        }

        public Builder addTopping(String topping) {
            this.topping = topping;
            return this;
        }

        public Builder withCheeseType(String cheeseType) {
            this.cheeseType = cheeseType;
            return this;
        }

        public Builder atRate(double rate) {
            this.rate = rate;
            return this;
        }

        public Builder atBranch(String branch) {
            this.branch = branch;
            return this;
        }

        public Pizza build() {
            Pizza pizza = new Pizza(this);
            return pizza;
        }


    }
}
