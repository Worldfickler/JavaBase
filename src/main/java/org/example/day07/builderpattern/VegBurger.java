package org.example.day07.builderpattern;

/**
 * @author Fickler
 * @date 2024/4/23 15:03
 */
public class VegBurger extends Burger{
    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public float price() {
        return 15;
    }
}
