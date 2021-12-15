package com.epam.demo;

public class Employee extends Person {

    private String title;
    private double salary;

    public Employee(final String name,
                    final int age,
                    final String title,
                    final double salary) {
        super(name, age);
        checkTitle(title);
        checkSalary(salary);
        this.title = title;
        this.salary = salary;
    }

    private void checkSalary(final double salary) {
        if (salary < 100.0) {
            throw new IllegalArgumentException("It is illegal");
        }
    }

    private void checkTitle(final String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("The title is empty");
        }
    }

    public String getTitle() {
        return title;
    }

    public double getSalary() {
        return salary;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public void raiseSalary(double mult) {
        if (mult <= 1.0) {
            throw new IllegalArgumentException("It is Illegal!");
        }
        this.salary *= mult;
    }

    @Override
    public String toString() {
        return super.toString() + " is a " + title + " and has a salary of " + salary;
    }
}
