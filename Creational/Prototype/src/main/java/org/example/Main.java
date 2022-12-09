package org.example;

public class Main {
    public static void main(String[] args) {
        Shape oldRectangle = new Rectangle(5,5);
        oldRectangle.setX(0);
        oldRectangle.setY(0);
        oldRectangle.setColor("red");
        Shape oldCircle = new Circle(2);
        oldCircle.setY(1);
        oldCircle.setX(1);
        oldCircle.setColor("blue");

        Shape newRectangle = oldRectangle.clone();
        newRectangle.setColor("blue");
        newRectangle.setX(1);

        Shape newCircle = oldCircle.clone();

        System.out.println("A mostrar os dois retangulos, sendo o segundo um clone do primeiro com alguns campos alterados para mostrar que o objeto é de facto clonado num novo");
        System.out.println(oldRectangle.toString());
        System.out.println(newRectangle.toString());

        System.out.println("A mostrar os dois circulos, sendo o segundo um clone do primeiro");
        System.out.println(oldCircle.toString());
        System.out.println(newCircle.toString());

    }
}