package com.dinhgt.pattern.structural.bridge.withoutbridge;


public class Main {

    public static void main(String[] args){
        Shape blueCircle = new BlueCircle();
        Shape yellowCircle = new YellowCircle();

        blueCircle.applyColor();
        yellowCircle.applyColor();
    }


}
