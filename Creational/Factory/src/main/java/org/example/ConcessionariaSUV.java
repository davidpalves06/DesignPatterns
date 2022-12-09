package org.example;

public class ConcessionariaSUV {
    public static void main(String[] args) {
        CarFactory factory = new SUVFactory();
        Car suv = factory.createCar();
        suv.drive();
    }
}