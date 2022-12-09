package org.example;

public class AdvancedRemote extends Remote{

    private int volume;

    public AdvancedRemote(Device device) {
        super(device);
        volume = 0;
    }

    public void mute() {
        volume = device.getVolume();
        device.setVolume(0);
    }

    public void unmute() {
        device.setVolume(volume);
    }
}
