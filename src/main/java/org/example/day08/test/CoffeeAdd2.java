package org.example.day08.test;

import java.lang.reflect.Constructor;

/**
 * @author Fickler
 * @date 2024/4/24 17:24
 */
public class CoffeeAdd2 extends Coffe{
    public CoffeeAdd2() throws Exception {
    }

    @Override
    public double getPrice() {
        return 20;
    }

    @Override
    public Constructor<?> getConstructer() throws Exception {
        return null;
    }
}
