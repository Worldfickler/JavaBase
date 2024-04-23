package org.example.day07.decoratorpattern;

/**
 * Shape 接口的装饰类
 * @author Fickler
 * @date 2024/4/23 16:23
 */
public class ShapeDecorator implements Shape{
    protected Shape decoratorShape;

    public ShapeDecorator(Shape decoratorShape) {
        this.decoratorShape = decoratorShape;
    }

    @Override
    public void draw() {
        decoratorShape.draw();
    }
}
