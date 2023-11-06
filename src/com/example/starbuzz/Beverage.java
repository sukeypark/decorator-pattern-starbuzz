package com.example.starbuzz;

public abstract class Beverage {

    protected String description = "Unknown Beverage";

    public void getDescription() {
        System.out.println(description);
    }

    public abstract double cost();

}
