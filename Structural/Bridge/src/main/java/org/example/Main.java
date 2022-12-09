package org.example;

public class Main {
    public static void main(String[] args) {
        Television tv = new Television();
        Radio radio = new Radio();

        Remote simpleRemote = new Remote(tv);
        AdvancedRemote advancedRemote = new AdvancedRemote(radio);

        simpleRemote.turnOn();
        advancedRemote.turnOn();
        System.out.println("-------------------------------------------------");
        simpleRemote.volumeUp();
        advancedRemote.mute();
        System.out.println("-------------------------------------------------");
        simpleRemote.volumeDown();
        advancedRemote.unmute();
        System.out.println("-------------------------------------------------");
        simpleRemote.turnOff();
        advancedRemote.turnOff();
    }
}