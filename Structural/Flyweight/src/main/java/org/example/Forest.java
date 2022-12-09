package org.example;

import java.util.ArrayList;
import java.util.List;

public class Forest {
    List<Tree> trees;
    TreeFactory factory;

    public Forest() {
        trees = new ArrayList<>();
        factory = new TreeFactory();
    }

    public void plantTree(String arvore,int x,int y) {
        TreeFlyweight flyweight = factory.getTreeFlyweight(arvore);
        Tree tree = new Tree(x,y,flyweight);
        trees.add(tree);
    }

    public void drawForest() {
        trees.forEach(Tree::draw);
    }
}
