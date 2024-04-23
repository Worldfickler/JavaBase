package org.example.day06.decorator.decorator2;

/**
 * @author Fickler
 * @date 2024/4/22 15:36
 */
public class ChickenBurger extends Humburger{
    public ChickenBurger() {
        name = "鸡腿堡";
    }

    @Override
    public double getPrice() {
        return 10;
    }
}
