package org.example.day05;

import java.lang.reflect.Field;

/**
 * Class 类的常用方法
 * @author Fickler
 * @date 2024/4/19 10:16
 */
public class Class02 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        String classPath = "org.example.day05.Cat";
        // 1. 获取 Cat 类对应的对象
        Class<?> aClass = Class.forName(classPath);
        System.out.println(aClass);
        // 2. 获取包名
        String packageName = aClass.getPackage().getName();
        System.out.println(packageName);
        // 3. 获取全类名
        String className = aClass.getName();
        System.out.println(className);
        // 4. 创建实例
        Cat cat = (Cat) aClass.newInstance();
        System.out.println(cat);
        // 5. 获取属性
        Field name = aClass.getField("name");
        System.out.println(name.get(cat));
        // 6. 给属性赋值
        name.set(cat, "小花猫");
        System.out.println(name.get(cat));
        // 7. 获取全部属性
        Field[] fields = aClass.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
    }
}
