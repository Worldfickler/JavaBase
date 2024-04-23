package org.example.day06.decorator.decorator2;

/**
 * @author Fickler
 * @date 2024/4/22 15:35
 */
public abstract class Humburger {
    protected String name;

    public String getName() {
        return name;
    }

    public abstract double getPrice();
}
