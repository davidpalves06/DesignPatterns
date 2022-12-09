package org.example;

public class Main {
    public static void main(String[] args) {
        StringObservable stringObservable = new StringObservable("");
        BinaryStringObserver binaryObserver = new BinaryStringObserver();
        stringObservable.addObserver(binaryObserver);
        HexaStringObserver hexaObserver = new HexaStringObserver();
        stringObservable.addObserver(hexaObserver);
        StringObserver stringObserver = new StringObserver();
        stringObservable.addObserver(stringObserver);

        stringObservable.setMessage("Observer Pattern");
        System.out.println(stringObserver);
        System.out.println(binaryObserver);
        System.out.println(hexaObserver);

        stringObservable.removeObserver(binaryObserver);
        stringObservable.setMessage("BinaryObserver removed!");
        System.out.println(stringObserver);
        System.out.println(binaryObserver);
        System.out.println(hexaObserver);
    }
}