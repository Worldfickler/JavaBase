package org.example.day06.observer.classs;

import org.example.day06.observer.interfaces.Observer;
import org.example.day06.observer.interfaces.Subject;

/**
 * 模拟使用者1
 * @author Fickler
 * @date 2024/4/22 9:07
 */
public class Observer1 implements Observer {
    private Subject subject;

    public Observer1(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        System.out.println("observer1 得到的 3D 号码 --> " + msg);
    }
}
