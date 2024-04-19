package org.example.day05;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 反射的基本方法
 * @author Fickler
 * @date 2024/4/19 9:17
 */
public class Reflection01 {

    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/main/resources/re.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String method = properties.get("method").toString();
        Class<?> aClass = Class.forName(classfullpath);
        Object o = aClass.newInstance();
        System.out.println("运行时类型 = " + o);
        Method classMethod = aClass.getMethod(method);
        // 传统方法：对象.方法()，反射：方法.invoke(对象)
        classMethod.invoke(o);
        // getField() 不能拿到私有属性
        Field fieldName = aClass.getField("name");
        // 传统方法：对象.成员变量，反射：成员变量对象.get(对象)
        Object name = fieldName.get(o);
        System.out.println("name = " + name);
        // () 内可以指定构造器参数的类型，返回无参构造器
        Constructor<?> constructor = aClass.getConstructor();
        System.out.println("构造器 = " + constructor);
        Constructor<?> constructor1 = aClass.getConstructor(String.class);
        System.out.println("构造器 = " + constructor1);

    }

}
