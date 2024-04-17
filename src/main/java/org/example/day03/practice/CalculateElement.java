package org.example.day03.practice;

/**
 * @author Fickler
 * @date 2024/4/17 11:46
 */

public abstract class CalculateElement<T, R> implements Calculate<T, R> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public R customCalculate(Calculate<T, R> calculator) {
        return calculator.calculate(getValue());
    }
}
