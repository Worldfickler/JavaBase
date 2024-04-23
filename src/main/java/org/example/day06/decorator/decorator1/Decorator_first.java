package org.example.day06.decorator.decorator1;

/**
 * @author Fickler
 * @date 2024/4/22 15:27
 */
public class Decorator_first extends Decorator{

    public Decorator_first(Human human) {
        super(human);
    }

    public void goClothespress() {
        System.out.println("去衣柜找找看...");
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        goClothespress();
    }
}
