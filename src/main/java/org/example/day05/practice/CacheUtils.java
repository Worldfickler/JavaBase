package org.example.day05.practice;

import java.util.HashMap;
import java.util.Map;

/**
 * 缓存工具类，提供put(String key,Object value)方法，入参为一个key和一个任意类型的值。
 * get(String key,Class<T> clazz):T 方法，能够将key对应的值获取到，并转换为T类型的值返回。
 * @author Fickler
 * @date 2024/4/19 14:48
 */
public class CacheUtils<T> {
    private static final Map<String, Object> cache = new HashMap<>();
    public void put(String key, Object value) {
        cache.put(key, value);
    }

    public T get(String key, Class<T> clazz) {
        Object value = cache.get(key);
        T cast = null;
        if (value == null) {
            System.out.println("没有找到 key 对应的值");
            return cast;
        }
        try {
            cast = clazz.cast(value);
        } catch (ClassCastException e) {
            System.out.println("转换失败 = " + e);
        }
        return cast;
    }
}