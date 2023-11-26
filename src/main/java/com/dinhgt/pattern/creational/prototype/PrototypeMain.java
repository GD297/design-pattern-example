package com.dinhgt.pattern.creational.prototype;

public class PrototypeMain {

    public static void main(String[] args){
        Car car1 = new Car("1X-01", "23-AB-8686","Turbo X10",  "Super Car");
        Car car2 = (Car) car1.clone();
        System.out.println(car1 == car2);
    }
}
