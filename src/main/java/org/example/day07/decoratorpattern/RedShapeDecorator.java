package org.example.day07.decoratorpattern;

/**
 * @author Fickler
 * @date 2024/4/23 16:28
 */
public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        decoratorShape.draw();
        setRedBorder(decoratorShape);
    }
    private void setRedBorder(Shape decoratorShape) {
        System.out.println("Border Color = red");
    }
}
