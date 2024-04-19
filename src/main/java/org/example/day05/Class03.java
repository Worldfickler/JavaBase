package org.example.day05;

/**
 * 获取 Class 类对象
 * @author Fickler
 * @date 2024/4/19 10:31
 */
public class Class03 {
    public static void main(String[] args) throws ClassNotFoundException {
        String classPath = "org.example.day05.Cat";
        // 1. Class.forName()
        // 多用于配置文件，读取类全路径，加载类
        Class<?> aClass1 = Class.forName(classPath);
        System.out.println(aClass1);
        // 2. xxx.class
        // 多用于参数传递，比如通过反射得到对应构造器对象
        Class<Cat> aClass2 = Cat.class;
        System.out.println(aClass2);
        // 3. 对象.getClass()
        Cat cat = new Cat();
        Class<? extends Cat> aClass3 = cat.getClass();
        System.out.println(aClass3);

        System.out.println(aClass1.hashCode());
        System.out.println(aClass2.hashCode());
        System.out.println(aClass3.hashCode());
        // 4. 基本数据类型（8 种都可以）
        Class<Integer> integerClass = int.class;
        Class<Character> characterClass = char.class;
        Class<Boolean> booleanClass = boolean.class;
        // 5. 基本数据类型对应的包装类 .TYPE
        Class<Integer> type1 = Integer.TYPE;
        Class<Character> type2 = Character.TYPE;
        System.out.println(integerClass.hashCode());
        System.out.println(type1.hashCode());
    }
}
