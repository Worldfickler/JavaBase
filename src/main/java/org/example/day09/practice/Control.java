package org.example.day09.practice;

/**
 * @author Fickler
 * @date 2024/4/25 13:25
 */
public interface Control<T> {
    void printControl(T t, String type) throws NoSuchFieldException, IllegalAccessException;
}
