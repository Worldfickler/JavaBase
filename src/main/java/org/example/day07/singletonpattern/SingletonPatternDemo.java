package org.example.day07.singletonpattern;

/**
 * @author Fickler
 * @date 2024/4/23 14:08
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingleObject instance = SingleObject.getInstance();
        instance.showMessage();
    }
}
