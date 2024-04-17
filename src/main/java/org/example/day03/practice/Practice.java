package org.example.day03.practice;

/**
 * @author Fickler
 * @date 2024/4/17 11:41
 */
public class Practice {

    public static void main(String[] args) {

        IntCalculateElement element = new IntCalculateElement(10);
        System.out.println(element.calculate(20));
        System.out.println(element.customCalculate(integer -> integer * 5));

    }

}