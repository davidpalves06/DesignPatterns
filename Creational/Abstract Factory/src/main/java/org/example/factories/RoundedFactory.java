package org.example.factories;

import org.example.models.Button;
import org.example.models.RoundedButton;
import org.example.models.RoundedWindow;
import org.example.models.Window;

public class RoundedFactory implements AbstractFactory{
    @Override
    public Button createButton() {
        return new RoundedButton();
    }

    @Override
    public Window createWindow() {
        return new RoundedWindow();
    }
}
