package com.epam.demo;

public class Food {

    private final Type type;
    private final String name;

    public Food(String name, final Type type) {
        this.name = name;
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public enum Type {
        MEAT, GRAIN, VEGETABLES
    }
}
