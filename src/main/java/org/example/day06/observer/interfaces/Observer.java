package org.example.day06.observer.interfaces;

/**
 * 观察者接口，所有潜在的观察者都必须实现这个接口
 * @author Fickler
 * @date 2024/4/22 8:58
 */
public interface Observer {

    public void update(String msg);

}
