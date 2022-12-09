package org.example.factories;

import org.example.models.Button;
import org.example.models.RectangleButton;
import org.example.models.RectangleWindow;
import org.example.models.Window;

public class RectangleFactory implements AbstractFactory{
    @Override
    public Button createButton() {
        return new RectangleButton();
    }

    @Override
    public Window createWindow() {
        return new RectangleWindow();
    }
}
