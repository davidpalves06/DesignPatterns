package org.example;

public class AmericanRadarAdapter extends AmericanRadar{

    private final BMW car;

    public AmericanRadarAdapter(BMW car) {
        this.car = car;
    }

    @Override
    public int getSpeed() {
        return (int) (car.getSpeed() * 0.621371192);
    }
}
