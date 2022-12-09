package org.example;

public class Tree {
    private final int x;
    private final int y;
    private final TreeFlyweight treeFlyweight;

    public Tree(int x, int y, TreeFlyweight treeFlyweight) {
        this.x = x;
        this.y = y;
        this.treeFlyweight = treeFlyweight;
    }

    public void draw() {
        treeFlyweight.draw(x,y);
    }
}
