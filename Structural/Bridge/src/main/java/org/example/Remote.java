package org.example;

public class Remote {

    protected Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void turnOn() {
        device.enable();
    }

    public void turnOff() {
        device.disable();
    }

    public void volumeUp() {
        int volume = device.getVolume();
        if (volume < 100) {
            device.setVolume(volume + 1);
        }
    }

    public void volumeDown() {
        int volume = device.getVolume();
        if (volume > 0) {
            device.setVolume(volume - 1);
        }
    }
}
