package org.example.day03.practice;

/**
 * @author Fickler
 * @date 2024/4/17 11:56
 */
public class IntCalculateElement extends CalculateElement<Integer, Integer>{

    public IntCalculateElement(Integer i) {
        setValue(i);
    }

    @Override
    public Integer calculate(Integer integer) {
        return integer + getValue();
    }
}
