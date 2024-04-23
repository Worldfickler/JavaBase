package org.example.day06.factory.simplefactory;

/**
 * 简单工厂模式的核心是定义一个创建对象的接口，将对象的创建和本身的业务逻辑分离，降低系统的耦合度
 * 使得两个修改起来相对容易些，当以后实现改变时，只需要修改工厂类即可。
 * @author Fickler
 * @date 2024/4/22 11:46
 */
public class Customer {
    public static void main(String[] args) {
        Factory factory = new Factory();
        BMW bmw320 = factory.createBMW(320);
        BMW bmw523 = factory.createBMW(523);
    }
}
