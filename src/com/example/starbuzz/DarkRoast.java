package com.example.starbuzz;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        this.description = "Dark Roast";
        this.milk = false;
        this.soy = false;
        this.whip = false;
        this.mocha = true;
    }

    @Override
    public double cost() {
        return .99 + super.cost();
    }

}
