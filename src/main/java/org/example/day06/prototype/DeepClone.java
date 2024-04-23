package org.example.day06.prototype;

import java.util.ArrayList;

/**
 * @author Fickler
 * @date 2024/4/22 14:05
 */
public class DeepClone extends Prototype{

    @Override
    protected Prototype clone() {
        Prototype prototype = null;
        try {
            prototype = (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        prototype.list = (ArrayList<String>) this.list.clone();
        return prototype;
    }

    @Override
    public void show() {
        System.out.println("深克隆");
    }
}
