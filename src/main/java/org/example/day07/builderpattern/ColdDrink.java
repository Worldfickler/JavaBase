package org.example.day07.builderpattern;

/**
 * @author Fickler
 * @date 2024/4/23 14:57
 */
public abstract class ColdDrink implements Item{
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
