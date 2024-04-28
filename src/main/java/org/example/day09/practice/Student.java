package org.example.day09.practice;

/**
 * @author Fickler
 * @date 2024/4/24 14:15
 */
public class Student {
    public String name;
    public int age;
    public String dealMessage = "";

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDealMessage() {
        return dealMessage;
    }

    public void setDealMessage(String dealMessage) {
        this.dealMessage = dealMessage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dealMessage='" + dealMessage + '\'' +
                '}';
    }
}
