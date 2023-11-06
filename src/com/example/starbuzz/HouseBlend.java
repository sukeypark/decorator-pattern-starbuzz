package com.example.starbuzz;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.description = "House Blend";
        this.milk = true;
        this.soy = false;
        this.whip = true;
        this.mocha = true;
    }

    @Override
    public double cost() {
        return 1.2 + super.cost();
    }

}
