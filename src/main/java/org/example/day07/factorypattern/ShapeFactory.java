package org.example.day07.factorypattern;

/**
 * 工厂，生成给定信息的实体类对象
 * @author Fickler
 * @date 2024/4/23 14:17
 */
public class ShapeFactory {
    public Shape getShape(String type) {
        if (type == null) {
            return null;
        } else if (type.equals("Rectangle")) {
            return new Rectangle();
        } else if (type.equals("Square")) {
            return new Square();
        } else if (type.equals("Circle")) {
            return new Circle();
        }
        return null;
    }
}
