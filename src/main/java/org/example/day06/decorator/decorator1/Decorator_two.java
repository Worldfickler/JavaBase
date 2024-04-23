package org.example.day06.decorator.decorator1;

/**
 * @author Fickler
 * @date 2024/4/22 15:28
 */
public class Decorator_two extends Decorator{
    public Decorator_two(Human human) {
        super(human);
    }

    public void findClothes() {
        System.out.println("找到一件衣服...");
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        findClothes();
    }
}
