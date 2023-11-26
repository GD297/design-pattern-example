package com.dinhgt.pattern.creational.prototype;

public class Car extends Vehicle{

    private String engine;
    private String name;

    public Car(String model, String license, String engine, String name) {
        super(model, license);
        this.engine = engine;
        this.name = name;
    }

    public Car(String engine, String name) {
        this.engine = engine;
        this.name = name;
    }

    public Car(Car car){
        super(car);
        this.engine = car.getEngine();
        this.name = car.getName();
    }

    public Car() {
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean isClone(Vehicle vehicle) {
        if (!(vehicle instanceof Car)){
            return false;
        }
        Car car = (Car) vehicle;
        return car.getLicense().equals(this.getLicense()) &&
                car.getEngine().equals(this.getEngine()) &&
                car.getName().equals(this.getName()) &&
                car.getModel().equals(this.getModel());
    }

    @Override
    public Vehicle clone() {
        return new Car(this);
    }
}
