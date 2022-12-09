package org.example;

public class Television implements Device{

    private boolean enabled;
    private int volume;

    public Television() {
        this.enabled = false;
        this.volume = 50;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void enable() {
        if (enabled) {
            System.out.println("Television already on!");
        }
        else {
            enabled = true;
            System.out.println("Turning television on!");
        }
    }

    @Override
    public void disable() {
        if (enabled) {
            enabled = false;
            System.out.println("Turning television off!");
        }
        else {
            System.out.println("Television already off!");
        }
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Television volume is now " + volume);
    }
}
