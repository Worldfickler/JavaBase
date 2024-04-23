package org.example.day06.decorator.decorator1;

/**
 * @author Fickler
 * @date 2024/4/22 15:29
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Person person = new Person();
        Decorator decorator = new Decorator_two(new Decorator_first(new Decorator_zero(person)));
        decorator.wearClothes();
    }
}
