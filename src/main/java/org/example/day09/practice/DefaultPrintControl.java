package org.example.day09.practice;

import java.lang.reflect.Field;

/**
 * @author Fickler
 * @date 2024/4/25 14:21
 */
public class DefaultPrintControl implements Control{
    @Override
    public void printControl(Student student, String type) throws NoSuchFieldException, IllegalAccessException {
        System.out.println("默认 格式的控制台输出");
        Class<? extends Student> studentClass = student.getClass();
        Field field = studentClass.getField(type);
        Object o = field.get(student);
        String typeName = field.getType().getName();
        String name = field.getName();
        System.out.println("输出内容 = " + o + " " + typeName + " " + name);
        System.out.println(student);
    }
}
