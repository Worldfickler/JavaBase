package org.example.day07.prototypepattern;

/**
 * @author Fickler
 * @date 2024/4/23 14:25
 */
public class Circle extends Shape{
    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Circle");
    }
}
