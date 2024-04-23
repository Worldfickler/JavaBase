package org.example.day07.decoratorpattern;

/**
 * @author Fickler
 * @date 2024/4/23 16:22
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("draw = Circle");
    }
}
