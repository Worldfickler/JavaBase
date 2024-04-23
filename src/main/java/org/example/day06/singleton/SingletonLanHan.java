package org.example.day06.singleton;

/**
 * 懒汉式会延迟加载，只有在首次调用时才会实例化单例。
 * 如果初始化所需要的工作比较多，那么首次访问性能上会有些延迟，不过之后就和饿汉式一样了。
 * 懒汉式本身是非线程安全的，需要通过额外的机制保证线程安全。
 * @author Fickler
 * @date 2024/4/22 13:12
 */
public class SingletonLanHan {

    public static class LanHanHolder {
        private static final SingletonLanHan INSTANCE = new SingletonLanHan();
    }

    private SingletonLanHan() {}

    public static final SingletonLanHan getInstance() {
        return LanHanHolder.INSTANCE;
    }
}
