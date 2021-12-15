package com.epam.demo;

public class Main {
    public static void main(String[] args) {

        Person[] alexFamily = {
                new Employee("Alex", 25, "Junior Software Developer", 1000.0),
                new Employee("Maria", 25, "Junior Software Developer", 1000.0),
                new Person("Julianna", 2)
        };

        for (Person person : alexFamily) {
            System.out.println(person);
        }


        Food rye = new Food("Rye", Food.Type.GRAIN);

        new Mouse("Pinky").feed(rye);
        new Lion("Alex").feed(rye);

    }
}
