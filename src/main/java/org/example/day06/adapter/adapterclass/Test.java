package org.example.day06.adapter.adapterclass;

/**
 * @author Fickler
 * @date 2024/4/22 14:52
 */
public class Test {
    public static void main(String[] args) {
        // 使用普通功能类
        ConcreteTarget concreteTarget = new ConcreteTarget();
        concreteTarget.request();

        // 使用特殊功能类，即适配器
        Adapter adapter = new Adapter();
        adapter.request();

    }
}
