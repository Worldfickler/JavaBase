package org.example.day07.prototypepattern;

/**
 * @author Fickler
 * @date 2024/4/23 14:27
 */
public class Square extends Shape{
    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Square");
    }
}
