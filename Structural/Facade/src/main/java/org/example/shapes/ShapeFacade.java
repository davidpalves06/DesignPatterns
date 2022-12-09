package org.example.shapes;

public class ShapeFacade {
    private Rectangle rectangle;
    private Circle circle;
    private Triangle triangle;

    public ShapeFacade(Rectangle rectangle, Circle circle, Triangle triangle) {
        this.rectangle = rectangle;
        this.circle = circle;
        this.triangle = triangle;
    }

    public ShapeFacade() {
        this.rectangle = new Rectangle();
        this.circle = new Circle();
        this.triangle = new Triangle();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawTriangle() {
        triangle.draw();
    }
}
