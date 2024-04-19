package org.example.day05;

import java.lang.reflect.Field;

/**
 * 反射获取成员变量
 * @author Fickler
 * @date 2024/4/19 11:14
 */
public class ReflectAccessField {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<?> catClass = Class.forName("org.example.day05.Cat");
        Object catInstance = catClass.newInstance();
        // 获取某个共有的字段
        Field catName = catClass.getField("name");
        catName.set(catInstance, "改名猫");
        System.out.println(catInstance);
        System.out.println(catName.get(catInstance));
        // 获取全部的共有字段
        Field[] fields = catClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        // 获取某个字段（private、protected、default、public）
        Field catAge = catClass.getDeclaredField("age");
        catAge.setAccessible(true);
        catAge.set(catInstance, 99);
        System.out.println(catInstance);
        System.out.println(catAge.get(catInstance));
        // 获取全部的字段
        Field[] declaredFields = catClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
    }
}
