package org.example.day07.factorypattern;

/**
 * @author Fickler
 * @date 2024/4/23 14:19
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("Circle");
        circle.draw();
        Shape square = shapeFactory.getShape("Square");
        square.draw();
        Shape rectangle = shapeFactory.getShape("Rectangle");
        rectangle.draw();
    }
}
