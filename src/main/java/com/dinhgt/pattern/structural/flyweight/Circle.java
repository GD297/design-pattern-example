package com.dinhgt.pattern.structural.flyweight;

public class Circle implements Shape {
    private final String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw(int x, int y, int radius) {
        System.out.println("Draw circle color " + color + " at (" + x + "," + y + ") with radius " + radius);
    }
}
