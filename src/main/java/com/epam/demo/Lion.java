package com.epam.demo;

import java.util.Collection;
import java.util.List;

public class Lion extends Animal{
    public Lion(final String name) {
        super(name);
    }

    @Override
    protected RuntimeException getBadFoodExceptions() {
        return new IllegalArgumentException("Roar!!!!");
    }

    @Override
    protected Collection<Food.Type> getAppropriateFoodTypes() {
        return List.of(Food.Type.MEAT);
    }
}
