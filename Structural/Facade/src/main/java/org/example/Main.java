package org.example;

import org.example.shapes.ShapeFacade;

public class Main {
    public static void main(String[] args) {
        ShapeFacade facade = new ShapeFacade();

        facade.drawRectangle();
        facade.drawCircle();
        facade.drawTriangle();

    }
}