package org.example.day09.practice;

import java.lang.reflect.Field;

/**
 * @author Fickler
 * @date 2024/4/25 14:21
 */
public class DefaultPrintControl<T> implements Control<T>{
    @Override
    public void printControl(T t, String type) throws NoSuchFieldException, IllegalAccessException {
        Class<?> aClass = t.getClass();
        Field declaredField = aClass.getDeclaredField(type);
        Object o = declaredField.get(t);
        String str = "字段类型 = " + declaredField.getType().getName() + " 字段名称 = " + declaredField.getName() + " 字段内容 = " + o + "\n";
        System.out.println("输出内容：" + str);
    }

}
