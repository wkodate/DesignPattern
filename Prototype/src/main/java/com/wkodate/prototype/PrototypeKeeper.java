package com.wkodate.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * PrototypeKeeper.java
 *
 * @author wkodate
 *
 */
public class PrototypeKeeper {

    private final Map<String, Cloneable> map;

    public PrototypeKeeper() {
        this.map = new HashMap<String, Cloneable>();
    }

    public void addCloneable(String key, Cloneable prototype) {
        map.put(key, prototype);
    }

    public Cloneable getClone(String key) {
        Cloneable prototype = map.get(key);
        return prototype.createClone();
    }

}