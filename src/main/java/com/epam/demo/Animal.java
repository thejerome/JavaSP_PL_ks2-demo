package com.epam.demo;

import java.util.Collection;

public abstract class Animal {

    private String name;

    public Animal(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void feed(Food food) {
        if (getAppropriateFoodTypes().contains(food.getType())) {
            System.out.println("Yummy");
        } else {
            throw getBadFoodExceptions();
        }
    }

    protected abstract RuntimeException getBadFoodExceptions();

    protected abstract Collection<Food.Type> getAppropriateFoodTypes();

}
