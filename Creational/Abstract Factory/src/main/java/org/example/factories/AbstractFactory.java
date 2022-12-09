package org.example.factories;

import org.example.models.Button;
import org.example.models.Window;

public interface AbstractFactory {
    public Button createButton();
    public Window createWindow();
}
