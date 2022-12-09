package org.example;

public abstract class Shape {
    private String color;
    private int x,y;

    public Shape() {};

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Shape(Shape source) {
        this();
        this.x = source.x;
        this.y = source.y;
        this.color = source.color;
    }

    public abstract Shape clone();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", x=" + x +
                ", y=" + y ;
    }
}
