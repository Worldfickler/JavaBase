package org.example.day07.singletonpattern;

/**
 * @author Fickler
 * @date 2024/4/23 14:06
 */
public class SingleObject {
    private static SingleObject instance = new SingleObject();

    private SingleObject() {
    }

    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("SingleObject");
    }
}
