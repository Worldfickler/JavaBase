package org.example.day06.prototype;

import java.util.ArrayList;

/**
 * @author Fickler
 * @date 2024/4/22 13:58
 */
public class ShallowClone extends Prototype{
    @Override
    protected Prototype clone() {
        Prototype prototype = null;
        try {
            prototype = (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return prototype;
    }

    @Override
    public void show() {
        System.out.println("浅克隆");
    }
}
