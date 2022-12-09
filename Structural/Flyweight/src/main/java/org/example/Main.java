package org.example;

public class Main {
    public static void main(String[] args) {
        Forest forest = new Forest();

        forest.plantTree("pinheiro",10,10);
        forest.plantTree("sobreiro",10,10);
        forest.plantTree("pinheiro",5,5);
        forest.plantTree("sobreiro",5,5);

        forest.drawForest();
    }
}