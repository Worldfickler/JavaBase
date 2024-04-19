package org.example.day05;

/**
 * @author Fickler
 * @date 2024/4/19 14:21
 */
public class TestIsAssignableFrom {
    public static void main(String[] args) {
        System.out.println(B.class.isAssignableFrom(A.class));
        System.out.println(A.class.isAssignableFrom(B.class));
    }
}

interface A {}

class B implements A {}