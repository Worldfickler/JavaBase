package org.example.day05;

/**
 * @author Fickler
 * @date 2024/4/19 9:18
 */
public class Cat {


    public String name = "招财猫";
    private String color = "黄色";
    private int age = 10;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    private Cat(String color, int age) {
        this.color = color;
        this.age = age;
    }

    public void hi() {
//        System.out.println("hi " + name);
    }

    public void cry() {
        System.out.println(name + " 喵喵叫..");
    }

    private void hello(String str) {
        System.out.println("私有方法 hello() " + str);
    }

    private String helloStr(String str) {
        return str + " helloStr";
    }

}

