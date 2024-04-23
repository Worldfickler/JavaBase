package org.example.day07.builderpattern;

/**
 * @author Fickler
 * @date 2024/4/23 15:05
 */
public class Pepsi extends Burger{
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 16.5F;
    }
}
