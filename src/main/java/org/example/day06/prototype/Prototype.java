package org.example.day06.prototype;

import java.util.ArrayList;

/**
 * @author Fickler
 * @date 2024/4/22 13:54
 */
public abstract class Prototype implements Cloneable{
    protected ArrayList<String> list = new ArrayList<>();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public abstract void show();
}
