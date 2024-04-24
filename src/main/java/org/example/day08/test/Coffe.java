package org.example.day08.test;

import java.lang.reflect.Constructor;
import java.util.HashMap;

/**
 * @author Fickler
 * @date 2024/4/24 16:41
 */
public abstract class Coffe {

    private static final HashMap<Integer, Constructor<?>> map = new HashMap<>();

    public static HashMap<Integer, Constructor<?>> getMap(){
        return map;
    }

    public Coffe() throws Exception {
        init();
    }

    private void init() throws Exception {
        map.put(map.size(),this.getConstructer());
    }

    public abstract double getPrice();

    public abstract Constructor<?> getConstructer() throws Exception;


}
