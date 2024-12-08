package com.dinhgt.pattern.structural.bridge.withbridge;

public class Circle extends Shape{
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        this.color.applyColor();
    }
}
