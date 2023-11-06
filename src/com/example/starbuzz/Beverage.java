package com.example.starbuzz;

public abstract class Beverage {

    protected String description;

    protected boolean milk;

    protected boolean soy;

    protected boolean mocha;

    protected boolean whip;

    private double milkCost = 0.2;

    private double soyCost = 0.25;

    private double mochaCost = 0.1;

    private double whipCost = 0.15;

    public boolean hasMilk() {
        return this.milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean hasSoy() {
        return this.soy;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public boolean hasMocha() {
        return this.mocha;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public boolean hasWhip() {
        return this.whip;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }

    public void getDescription() {
        System.out.println(description);
    }

    public double cost() {
        double contimentCost = 0.0;
        if (hasMilk()) {
            contimentCost += milkCost;
        }
        if (hasSoy()) {
            contimentCost += soyCost;
        }
        if (hasMocha()) {
            contimentCost += mochaCost;
        }
        if (hasWhip()) {
            contimentCost += whipCost;
        }

        return contimentCost;
    };
}
