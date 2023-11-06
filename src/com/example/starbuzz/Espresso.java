package com.example.starbuzz;

public class Espresso extends Beverage {

    public Espresso() {
        this.description = "Espresso";
        this.milk = false;
        this.soy = false;
        this.whip = false;
        this.mocha = false;
    }

    @Override
    public double cost() {
        return 0.98 + super.cost();
    }

}
