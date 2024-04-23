package org.example.day06.decorator.decorator1;

/**
 * @author Fickler
 * @date 2024/4/22 15:19
 */
public abstract class Decorator implements Human{

    private Human human;

    public Decorator(Human human) {
        this.human = human;
    }

    @Override
    public void wearClothes() {
        human.wearClothes();
    }
}
