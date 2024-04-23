package org.example.day06.observer.interfaces;

/**
 * 主题接口，所有主题必须实现这个接口
 * @author Fickler
 * @date 2024/4/22 8:56
 */
public interface Subject {

    /**
     * 注册一个观察者
     * @param observer 观察者接口
     */
    public void registerObserver(Observer observer);

    /**
     * 移除一个观察者
     * @param observer 观察者接口
     */
    public void removeObserver(Observer observer);

    /**
     * 通知所有观察者 观察者接口
     */
    public void notifyObserver();

}
