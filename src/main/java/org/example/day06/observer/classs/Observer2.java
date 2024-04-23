package org.example.day06.observer.classs;

import org.example.day06.observer.interfaces.Observer;
import org.example.day06.observer.interfaces.Subject;

/**
 * 模拟使用者2
 * @author Fickler
 * @date 2024/4/22 9:09
 */
public class Observer2 implements Observer {

    private Subject subject;

    public Observer2(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        System.out.println("observer2 得到的 3D 号码 --> " + msg);
    }
}
