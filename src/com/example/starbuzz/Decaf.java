package com.example.starbuzz;

public class Decaf extends Beverage {

    public Decaf() {
        this.description = "Decaffein Coffee";
    }

    @Override
    public double cost() {
        return 1.5 + super.cost();
    }

}
