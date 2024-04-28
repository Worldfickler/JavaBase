package org.example.day09.practice;

/**
 * @author Fickler
 * @date 2024/4/24 14:17
 */
public interface Log<T> {
    void printLog(T t, String type) throws NoSuchFieldException, IllegalAccessException;
}
