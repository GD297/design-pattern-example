package com.dinhgt.pattern.structural.decorator;

public class Main {

    public static void main(String[] args){
        Sandwich sandwich = new DressingDecorator(new MeatDecorator( new SimpleSandwich()));
        System.out.println(sandwich.make());
    }

}
