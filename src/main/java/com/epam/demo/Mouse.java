package com.epam.demo;

import java.util.Arrays;
import java.util.Collection;

public class Mouse extends Animal {
    public Mouse(final String name) {
        super(name);
    }

    @Override
    protected RuntimeException getBadFoodExceptions() {
        return new IllegalArgumentException("Squick");
    }

    @Override
    protected Collection<Food.Type> getAppropriateFoodTypes() {
        return Arrays.asList(Food.Type.values());
    }
}
