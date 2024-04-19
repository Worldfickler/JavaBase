package org.example.day05.practice;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Fickler
 * @date 2024/4/19 15:20
 */
public class TestCheckUtils {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, InstantiationException {
        CheckUtils checkUtils = new CheckUtils();
        Test1 test1 = new Test1();
        Test2 test2 = new Test2();
        Object value = checkUtils.getValue(test1, String.class);
        Object value1 = checkUtils.getValue(test2, String.class);
        System.out.println("test1 = " + value);
        System.out.println("test2 = " + value1);
    }
}

class Test1 {
    String getValue() {
        return "1111";
    }
}

class Test2 {
    String getValue1() {
        return "22222";
    }
}