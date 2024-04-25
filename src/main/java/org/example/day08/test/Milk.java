package org.example.day08.test;

import java.lang.reflect.Constructor;

/**
 * @author Fickler
 * @date 2024/4/24 16:51
 */
public class Milk extends Coffe {
    private Coffe coffe;

    public Milk(Coffe coffe) throws Exception {
        super();
        this.coffe = coffe;
    }

    static {
        try {
            new Milk(null);
        } catch (Exception e) {
        }
    }


    @Override
    public double getPrice() {
        return coffe.getPrice() + 2;
    }

    @Override
    public Constructor<?> getConstructer() throws Exception {
        return this.getClass().getConstructor(Coffe.class);
    }
}
