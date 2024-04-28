package org.example.day09.practice;

import java.lang.reflect.Field;

/**
 * @author Fickler
 * @date 2024/4/25 14:46
 */
public class DealStudent<T> implements Deal<T>{

    @Override
    public void dealStudent(T t) throws NoSuchFieldException, IllegalAccessException {
        Class<?> aClass = t.getClass();
        Field dealMessage = aClass.getDeclaredField("dealMessage");
        dealMessage.setAccessible(true);
        Object o = dealMessage.get(t);
        dealMessage.set(t, o + " 已处理");
    }
}
