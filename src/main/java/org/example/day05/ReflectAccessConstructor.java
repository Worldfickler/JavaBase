package org.example.day05;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 反射获取构造方法
 * @author Fickler
 * @date 2024/4/19 11:06
 */
public class ReflectAccessConstructor {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        // 1. 获取到 Cat 类的 Class 对象
        Class<?> catClass = Class.forName("org.example.day05.Cat");
        // 2. 通过 public 的无参构造器创建实例
        Object o = catClass.newInstance();
        System.out.println(o);
        // 3. 通过 public 的有参构造器创建实例
        Constructor<?> catClassConstructor = catClass.getConstructor(String.class);
        Object instance = catClassConstructor.newInstance("小小猫");
        System.out.println("instance = " + instance);
        // 批量获取
        Constructor<?>[] constructors = catClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
        // 4. 通过非 public 的有参构造器创建实例
        Constructor<?> declaredConstructor = catClass.getDeclaredConstructor(String.class, int.class);
        declaredConstructor.setAccessible(true);
        Object instance1 = declaredConstructor.newInstance("大大猫", 99);
        System.out.println("instance1 = " + instance1);
    }
}
