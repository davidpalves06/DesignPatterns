package org.example;

public class Radio implements Device{

    private boolean enabled;
    private int volume;

    public Radio() {
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
            System.out.println("Radio already on!");
        }
        else {
            enabled = true;
            System.out.println("Turning radio on!");
        }
    }

    @Override
    public void disable() {
        if (enabled) {
            enabled = false;
            System.out.println("Turning radio off!");
        }
        else {
            System.out.println("Radio already off!");
        }
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Radio volume is now " + volume);
    }
}
