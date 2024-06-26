package org.example.day08.strategypattern;

/**
 * @author Fickler
 * @date 2024/4/24 11:39
 */
public class OperationAdd implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
