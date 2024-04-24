package org.example.day08.test;

import java.lang.reflect.Constructor;

/**
 * @author Fickler
 * @date 2024/4/24 17:28
 */
public class Sale extends Coffe{

    private Coffe coffe;

    public Sale(Coffe coffe) throws Exception {
        super();
        this.coffe = coffe;
    }

    @Override
    public double getPrice() {
        return 0.8 * coffe.getPrice();
    }

    @Override
    public Constructor<?> getConstructer() throws Exception {
        return null;
    }
}
