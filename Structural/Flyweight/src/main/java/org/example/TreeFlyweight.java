package org.example;

public class TreeFlyweight {
    private String name;
    private String color;

    public TreeFlyweight(String name,String color) {
        this.name = name;
        this.color = color;
    }

    public void draw(int x , int y) {
        System.out.println("A desenhar um " + name + " nas posiçoes " + x + " e " + y + "; " + this.hashCode());
    }
}
