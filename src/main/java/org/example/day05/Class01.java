package org.example.day05;

/**
 * Class 类的理解
 * @author Fickler
 * @date 2024/4/19 10:10
 */
public class Class01 {

    public static void main(String[] args) throws ClassNotFoundException {
        // 1. Class 也是类，也是继承 Object 类
        // 2. Class 对象不是 new 出来的，而是由系统创建的
        // 3. 对于某个类的 Class 类对象，在内存中存在一份，因为类只加载一次
        Class<?> aClass = Class.forName("org.example.day05.Cat");
        Class<?> aClass1 = Class.forName("org.example.day05.Cat");
        System.out.println(aClass.hashCode());
        System.out.println(aClass1.hashCode());

    }

}
