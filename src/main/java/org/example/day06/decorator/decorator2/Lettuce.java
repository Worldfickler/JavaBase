package org.example.day06.decorator.decorator2;

/**
 * @author Fickler
 * @date 2024/4/22 15:38
 */
public class Lettuce extends Condiment{
    Humburger humburger;

    public Lettuce(Humburger humburger) {
        this.humburger = humburger;
    }

    @Override
    public String getName() {
        return humburger.getName() + " 加生菜";
    }

    @Override
    public double getPrice() {
        return humburger.getPrice() + 1.5;
    }
}
