package org.example;

public class Main {
    public static void main(String[] args) {
        BMW bmw = new BMW(150);
        AmericanRadar radar = new AmericanRadarAdapter(bmw);

        System.out.println("A velocidade do BMW é " + bmw.getSpeed() + " KM.");
        System.out.println("A velocidade no radar é " + radar.getSpeed() + " MPH.");
    }

}