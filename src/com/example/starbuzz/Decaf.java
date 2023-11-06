package com.example.starbuzz;

public class Decaf extends Beverage {

    public Decaf() {
        this.description = "Decaffein Coffee";
        this.milk = false;
        this.soy = false;
        this.whip = false;
        this.mocha = true;
    }

    @Override
    public double cost() {
        return 1.5 + super.cost();
    }

}
