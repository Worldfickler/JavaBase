package org.example.day06.decorator.decorator2;

/**
 * @author Fickler
 * @date 2024/4/22 15:40
 */
public class Test {
    public static void main(String[] args) {
        Humburger humburger = new ChickenBurger();
        System.out.println(humburger.getName() + " 价钱 " + humburger.getPrice());
        Lettuce lettuce = new Lettuce(humburger);
        System.out.println(lettuce.getName() + " 价钱 " + lettuce.getPrice());
        Chilli chilli = new Chilli(humburger);
        System.out.println(chilli.getName() + " 价钱 " + chilli.getPrice());
        Chilli chilli1 = new Chilli(lettuce);
        System.out.println(chilli1.getName() + " 价钱 " + chilli1.getPrice());
    }
}
