package org.example.day05;

import java.util.ArrayList;
import java.util.List;

/**
 * xxx.cast() 转型方法
 *
 * @author Fickler
 * @date 2024/4/19 14:17
 */
public class TestCast {
    public static void main(String[] args) {
        Object obj = "hello word";
        Class<String> stringClass = String.class;
        try {
            String str = stringClass.cast(obj);
            System.out.println("成功转换为 String 类型 = " + str);
        } catch (ClassCastException e) {
            System.out.println("转换失败 = " + e);
        }

        Object obj1 = 123;
        try {
            String str1 = stringClass.cast(obj1);
            System.out.println("成功转换为 String 类型 = " + str1);
        } catch (ClassCastException e) {
            System.out.println("转换失败 = " + e);
        }
    }
}


