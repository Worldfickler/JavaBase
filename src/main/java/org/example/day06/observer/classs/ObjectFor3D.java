package org.example.day06.observer.classs;

import org.example.day06.observer.interfaces.Observer;
import org.example.day06.observer.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题实现类-3D服务号
 *
 * @author Fickler
 * @date 2024/4/22 9:02
 */
public class ObjectFor3D implements Subject {

    private List<Observer> observers = new ArrayList<>();

    // 3D 服务的号码
    private String msg;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(msg);
        }
    }

    public void setMsg(String msg) {
        this.msg = msg;
        notifyObserver();
    }
}
