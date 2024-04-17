package org.example;

import java.util.HashMap;

/**
 * 抽象类体现的就是一种模板模式的设计，抽象类作为多个子类的通用模板，子类在抽象类的基础上进行扩展，改造，同时保留抽象类的行为方式
 *
 * @author Fickler
 * @date 2024/4/16 11:55
 */
public class day02_AbstracClass {

    public static void main(String[] args) {

        StringBaseAbstract stringBaseAbstract = new StringBaseAbstract();
        BaseAbstract<?> instance = BaseAbstract.getInstance(stringBaseAbstract.getKey());
        System.out.println("stringBaseAbstract:" + stringBaseAbstract);
        System.out.println("instance:" + instance);
        System.out.println(instance.getContent());

    }

}

abstract class BaseAbstract<T> {

    public static HashMap<String, BaseAbstract<?>> hashMap = new HashMap<>();
    T t;

    public BaseAbstract() {
        hashMap.put(getKey(), this);
    }

    public static BaseAbstract<?> getInstance(String key) {
        return hashMap.get(key);
    }

    public abstract String getKey();

    public abstract T getContent();

}

class StringBaseAbstract<T> extends BaseAbstract<T> {

    private T t;

    public StringBaseAbstract() {
        super();
    }

    @Override
    public String getKey() {
        return "StringBaseAbstract";
    }

    @Override
    public T getContent() {
        return null;
    }

}

abstract class Employee {
    String name;
    int id;
    int salary;

    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public abstract void work();
}

class Manager extends Employee {
    int bonus;

    public Manager(String name, int id, int salary) {
        super(name, id, salary);
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println(getName() + " " + getId() + " " + getSalary() + " " + getBonus());
    }
}


abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();

}