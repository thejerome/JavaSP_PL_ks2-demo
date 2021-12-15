package com.epam.demo;

public class Person {
    private String name;
    private int age;

    public Person(final String name, final int age) {
        checkName(name);
        checkAge(age);

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        checkName(name);
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void incrementAge() {
        this.age++;
    }

    @Override
    public String toString() {
        return name + " of age " + age;
    }

    private static void checkName(final String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("The name " + name + " is not good at all");
        }
    }

    private void checkAge(final int age) {
        if (age < 0) {
            throw new IllegalArgumentException("The age may not be negative");
        }
    }
}
