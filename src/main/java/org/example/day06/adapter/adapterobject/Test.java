package org.example.day06.adapter.adapterobject;

import org.example.day06.adapter.adapterclass.Adaptee;
import org.example.day06.adapter.adapterclass.ConcreteTarget;

/**
 * @author Fickler
 * @date 2024/4/22 15:01
 */
public class Test {
    public static void main(String[] args) {
        ConcreteTarget concreteTarget = new ConcreteTarget();
        concreteTarget.request();

        Adapter adapter = new Adapter(new Adaptee());
        adapter.request();
    }
}
