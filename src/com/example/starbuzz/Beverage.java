package com.example.starbuzz;

public abstract class Beverage {

    protected String description;

    protected boolean milk;

    protected boolean soy;

    protected boolean mocha;

    protected boolean whip;

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

    public abstract double cost();

}
