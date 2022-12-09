package org.example;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private Map<String,TreeFlyweight> treeFlyweightMap;

    public TreeFactory() {
        this.treeFlyweightMap = new HashMap<>();
    }

    public TreeFlyweight getTreeFlyweight(String arvore) {
        if (!treeFlyweightMap.containsKey(arvore)) {
            TreeFlyweight flyweight = new TreeFlyweight(arvore,"castanho");
            treeFlyweightMap.put(arvore,flyweight);
        }
        return treeFlyweightMap.get(arvore);
    }
}
