package com.example.starbuzz.condiments;

import com.example.starbuzz.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {

    protected Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public abstract String getDescription();

}
