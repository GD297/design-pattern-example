package com.dinhgt.pattern.structural.decorator;

public class MeatDecorator implements Sandwich{

    protected Sandwich sandwich;

    public MeatDecorator(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public String make() {
        return sandwich.make() + addMeat();
    }

    public String addMeat(){
        return "+ Turkey";

    }

}
