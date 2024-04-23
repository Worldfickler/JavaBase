package org.example.day07.builderpattern;

/**
 * @author Fickler
 * @date 2024/4/23 14:55
 */
public abstract class Burger implements Item{
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
