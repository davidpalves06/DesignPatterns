package org.example;

import org.example.factories.AbstractFactory;
import org.example.models.Button;
import org.example.models.Window;

public class Screen {
    private final AbstractFactory factory;

    public Screen(AbstractFactory factory) {
        this.factory = factory;
    }

    public void createScreen() {
        Button b = factory.createButton();
        Window w = factory.createWindow();

        b.draw();
        w.draw();
    }

}