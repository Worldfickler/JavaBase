package org.example.day06.adapter.adapterobject;

/**
 * 具体目标类，只提供普通功能
 * @author Fickler
 * @date 2024/4/22 14:49
 */
public class ConcreteTarget implements Target {

    @Override
    public void request() {
        System.out.println("普通类具有普通功能");
    }
}
