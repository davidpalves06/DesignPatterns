package org.example;

import org.example.factories.RectangleFactory;
import org.example.factories.RoundedFactory;

public class FactoryInjector {
    public static void main(String[] args) {
        new Screen(new RectangleFactory()).createScreen();
        new Screen(new RoundedFactory()).createScreen();
    }
}
