package org.example.day07.prototypepattern;

/**
 * @author Fickler
 * @date 2024/4/23 14:44
 */
public class PrototypePatternDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        ShapeCache.loadCache();
        Shape shape = ShapeCache.getShape("1");
        System.out.println("Shape : " + shape.getType());
        Shape shape1 = ShapeCache.getShape("2");
        System.out.println("Shape : " + shape1.getType());
        Shape shape2 = ShapeCache.getShape("3");
        System.out.println("Shape : " + shape2.getType());
    }
}
