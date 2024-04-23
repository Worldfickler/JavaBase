package org.example.day07.decoratorpattern;

/**
 * @author Fickler
 * @date 2024/4/23 16:21
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("draw = Rectangle");
    }
}
