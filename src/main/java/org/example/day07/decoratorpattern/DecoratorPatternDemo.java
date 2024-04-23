package org.example.day07.decoratorpattern;

/**
 * @author Fickler
 * @date 2024/4/23 16:31
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        RedShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        RedShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("circle");
        circle.draw();
        System.out.println("RedShapeDecorator-Circle");
        redCircle.draw();
        System.out.println("RedShapeDecorator-Rectangle");
        redRectangle.draw();
    }
}
