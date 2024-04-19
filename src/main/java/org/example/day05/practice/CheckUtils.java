package org.example.day05.practice;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 编写工具类，提供一个getValue(Object obj,Class<T> clazz):T方法，首先检查obj中是否有getValue方法，
 * 如果有，则执行getValue方法，获取到返回值，并转换为T类ing返回
 *
 * @author Fickler
 * @date 2024/4/19 15:08
 */
public class CheckUtils<T> {
    public T getValue(Object obj, Class<T> clazz) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class<?> aClass = obj.getClass();
        Object objInstance = aClass.newInstance();
        Method getValue = null;
        Object invoke = null;
        T cast = null;
        try {
            getValue = aClass.getDeclaredMethod("getValue");
        } catch (Exception e) {
            System.out.println("没有找打 getValue 方法 = " + e);
        }
        if (getValue != null) {
            invoke = getValue.invoke(objInstance);
        }
        try {
            cast = clazz.cast(invoke);
        } catch (ClassCastException e) {
            System.out.println("转换失败 = " + e);
        }
        return cast;
    }
}
