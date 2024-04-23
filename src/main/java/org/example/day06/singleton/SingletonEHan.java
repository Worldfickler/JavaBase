package org.example.day06.singleton;

/**
 * 饿汉式是在类加载时，就将单例初始化完成，保证获取实例的时候，单例是已经存在的了。
 * 所以在第一次调用时速度也会更快，因为其资源已经初始化完成。
 * 饿汉式天生就是线程安全的，可以直接用于多线程而不会出现问题。
 * @author Fickler
 * @date 2024/4/22 13:22
 */
public class SingletonEHan {

    private SingletonEHan() {
    }

    private static final SingletonEHan single = new SingletonEHan();

    public static SingletonEHan getInstance() {
        return single;
    }
}
