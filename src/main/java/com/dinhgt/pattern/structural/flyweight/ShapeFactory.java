package com.dinhgt.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static final Map<String, Shape> CIRCLE_MAP = new HashMap<>();

    public static Shape getCircle(String color){
        Shape circle = CIRCLE_MAP.get(color);
        if(circle == null){
            circle = new Circle(color);
            CIRCLE_MAP.put(color, circle);
        }
        return circle;
    }
}
