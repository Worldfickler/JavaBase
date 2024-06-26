package org.example.day08.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题
 * @author Fickler
 * @date 2024/4/24 9:53
 */
public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
