package org.example.day05;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 反射获取成员方法
 * @author Fickler
 * @date 2024/4/19 11:38
 */
public class ReflectAccessMethod {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
//        Class<?> catClass = Class.forName("org.example.day05.Cat");
        Class<Cat> catClass = Cat.class;
        Cat cat = new Cat();
        Class<? extends Cat> aClass = cat.getClass();
        Object catInstance = catClass.newInstance();
        // 获取单个公有方法
        Method catHi = catClass.getMethod("hi");
        catHi.invoke(catInstance);
        // 获取多个公有方法
        Method[] methods = catClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        // 获取单个方法（private、protected、default、public）
        Method catCry = catClass.getDeclaredMethod("cry123");
        System.out.println("catCry " + catCry);
        catCry.invoke(catInstance);
        Method catHello = catClass.getDeclaredMethod("hello", String.class);
        catHello.setAccessible(true);
        catHello.invoke(catInstance, "test");
        Method helloStr = catClass.getDeclaredMethod("helloStr", String.class);
        helloStr.setAccessible(true);
        Object sdadadad = helloStr.invoke(catInstance, "sdadadad");
        System.out.println(sdadadad);
        // 获取多个方法
        Method[] declaredMethods = catClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
    }
}
