package org.example.day08.observerpattern;

/**
 * 观察者
 * @author Fickler
 * @date 2024/4/24 10:18
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
