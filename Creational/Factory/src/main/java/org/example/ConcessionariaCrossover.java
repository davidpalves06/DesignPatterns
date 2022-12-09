package org.example;

public class ConcessionariaCrossover {
    public static void main(String[] args) {
        CarFactory factory = new CrossoverFactory();
        Car suv = factory.createCar();
        suv.drive();
    }
}
