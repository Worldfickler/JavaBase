package org.example.day07.builderpattern;

/**
 * @author Fickler
 * @date 2024/4/23 15:05
 */
public class Coke extends Burger{
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 9.5F;
    }
}
