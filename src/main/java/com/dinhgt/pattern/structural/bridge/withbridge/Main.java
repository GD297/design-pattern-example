package com.dinhgt.pattern.structural.bridge.withbridge;

public class Main {
    public static void main(String[] args){
        Color color = new Yellow();
        Shape circle = new Circle(color);
        circle.applyColor();
    }

}
