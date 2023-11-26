package com.dinhgt.pattern.creational.prototype;

public abstract class Vehicle {
    private String model;
    private String license;

    public Vehicle(String model, String license) {
        this.model = model;
        this.license = license;
    }

    public Vehicle() {
    }

    public Vehicle(Vehicle vehicle) {
        this.license = vehicle.license;
        this.model = vehicle.model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public abstract boolean isClone(Vehicle vehicle);

    public abstract Vehicle clone();

}
