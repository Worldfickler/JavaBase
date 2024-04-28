package org.example.day09.practice;

/**
 * @author Fickler
 * @date 2024/4/25 14:35
 */
public interface Deal<T> {
    void dealStudent(T t) throws NoSuchFieldException, IllegalAccessException;
}
