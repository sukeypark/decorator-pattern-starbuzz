package com.example.starbuzz;

public abstract class Beverage {

    protected String description;

    public void getDescription() {
        System.err.println(description);
    }

    public abstract void cost();

}
