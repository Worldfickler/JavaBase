package org.example.day06.decorator.decorator2;

/**
 * @author Fickler
 * @date 2024/4/22 15:39
 */
public class Chilli extends Condiment{
    Humburger humburger;

    public Chilli(Humburger humburger) {
        this.humburger = humburger;
    }

    @Override
    public String getName() {
        return humburger.getName() + " 加辣椒";
    }

    @Override
    public double getPrice() {
        return humburger.getPrice() + 0.5;
    }
}
