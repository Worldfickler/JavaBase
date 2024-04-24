package org.example.day08.strategypattern;

/**
 * @author Fickler
 * @date 2024/4/24 11:40
 */
public class OperationMultiply implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
