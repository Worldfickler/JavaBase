package org.example.day06.decorator.decorator1;

/**
 * @author Fickler
 * @date 2024/4/22 15:25
 */
public class Decorator_zero extends Decorator{

    public Decorator_zero(Human human) {
        super(human);
    }

    public void goHome() {
        System.out.println("进房子...");
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        goHome();
    }
}
