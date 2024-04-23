package org.example.day07.builderpattern;

/**
 * @author Fickler
 * @date 2024/4/23 15:04
 */
public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "ChickenBurger";
    }

    @Override
    public float price() {
        return 25;
    }
}
