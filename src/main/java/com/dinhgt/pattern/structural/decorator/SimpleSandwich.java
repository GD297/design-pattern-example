package com.dinhgt.pattern.structural.decorator;

public class SimpleSandwich implements Sandwich{
    @Override
    public String make() {
        return "Bread";
    }
}
