package org.example.day08.test;

import java.lang.reflect.Constructor;

/**
 * @author Fickler
 * @date 2024/4/24 16:52
 */
public class CoffeAdd extends Coffe{

    public CoffeAdd() throws Exception {
    }

    public double getPrice() {
        return 10;
    }

    @Override
    public Constructor<?> getConstructer() throws Exception {
        return null;
    }

}