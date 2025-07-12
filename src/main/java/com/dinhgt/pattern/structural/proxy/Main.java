package com.dinhgt.pattern.structural.proxy;

public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");
        image.display(); // loaded from disk
        image.display(); // cached image
    }
}
