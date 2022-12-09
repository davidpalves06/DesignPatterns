package org.example;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.callAlert();
        System.out.println("Phone is now silent!");
        phone.silence();
        phone.callAlert();
        System.out.println("Phone is now vibrating!");
        phone.vibrant();
        phone.callAlert();
        System.out.println("Phone is now with sound on!");
        phone.soundOn();
        phone.callAlert();
    }
}