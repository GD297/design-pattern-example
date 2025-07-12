package com.dinhgt.pattern.structural.flyweight;

import java.util.Random;

public class Main {
    private static final String[] colors = {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {
        Random random = new Random();
        for(int i=0; i<10; i++){
            String color = colors[random.nextInt(colors.length)];
            Circle circle = (Circle) ShapeFactory.getCircle(color);
            circle.draw(random.nextInt(100), random.nextInt(100), 10);
        }
    }
}
