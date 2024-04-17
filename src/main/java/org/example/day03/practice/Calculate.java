package org.example.day03.practice;

/**
 * @author Fickler
 * @date 2024/4/17 11:42
 */
public interface Calculate<S, R> {

    R calculate(S s);

}