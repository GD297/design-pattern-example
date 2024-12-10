package com.dinhgt.pattern.structural.decorator;

public class DressingDecorator implements Sandwich{
    protected Sandwich sandwich;

    public DressingDecorator(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public String make() {
        return sandwich.make() + addDressing();
    }

    public String addDressing(){
        return "+ Sauce";
    }
}
