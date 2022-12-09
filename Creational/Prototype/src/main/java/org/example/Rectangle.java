package org.example;

public class Rectangle extends Shape{

    private int width,height;

    public Rectangle() {}

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle source) {
        super(source);
        this.height = source.height;
        this.width = source.width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
