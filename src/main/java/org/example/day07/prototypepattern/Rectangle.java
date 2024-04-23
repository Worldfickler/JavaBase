package org.example.day07.prototypepattern;

import org.example.day07.factorypattern.Square;

/**
 * @author Fickler
 * @date 2024/4/23 14:24
 */
public class Rectangle extends Shape{
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Rectangle");
    }
}
