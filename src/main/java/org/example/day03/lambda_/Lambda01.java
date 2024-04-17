package org.example.day03.lambda_;

import static jdk.nashorn.internal.objects.NativeRegExp.test;

/**
 * @author Fickler
 * @date 2024/4/17 11:06
 */
public class Lambda01 {

    public static void main(String[] args) {

        Person person = (name, age) -> {
            System.out.println("name: " + name + " age: " + age);
            return age + 1;
        };
        person.info("TestName", 12);

        // 静态方法的引用
        /*
        Num num = (a, b) -> {
            if (a > b) {
                return a - b;
            } else {
                return b - a;
            }
        };
        int compare = num.compare(3, 5);
        System.out.println(compare);
        */
        Num num = Num::calculate1;
        int compare = num.compare(1, 4);
        System.out.println(compare);


    }

}

interface Person {
    int info(String name, int age);
}

interface Num {

    static int calculate1(int a, int b) {
        return a > b ? a - b : b -a;
    }

//    int calculate2(int a, int b) {
//        return a > b ? a - b : b -a;
//    }

    int compare(int a, int b);
}