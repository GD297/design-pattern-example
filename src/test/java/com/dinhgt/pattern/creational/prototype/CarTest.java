package com.dinhgt.pattern.creational.prototype;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void cloneCreatesNewInstance() {
        Car car = new Car("model-1", "AA-123", "V8", "MyCar");
        Car clone = (Car) car.clone();
        assertNotSame(car, clone, "Clone should be a different object");
        assertTrue(car.isClone(clone), "Clone should match original properties");
    }
}
