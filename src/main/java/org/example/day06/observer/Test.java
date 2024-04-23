package org.example.day06.observer;

import org.example.day06.observer.classs.ObjectFor3D;
import org.example.day06.observer.classs.Observer1;
import org.example.day06.observer.classs.Observer2;
import org.example.day06.observer.interfaces.Observer;

/**
 * 服务号中维护了所有向它订阅的消息的使用者，当有消息更新的时候，通知所有用户
 * 观察者模式：一对多
 * @author Fickler
 * @date 2024/4/22 9:17
 */
public class Test {
    public static void main(String[] args) {
        ObjectFor3D subjectFor3d = new ObjectFor3D();
        Observer observer1 = new Observer1(subjectFor3d);
        Observer observer2 = new Observer2(subjectFor3d);
        subjectFor3d.setMsg("20240420的3D号码是：127");
        subjectFor3d.setMsg("20240421的3D号码是：333");
    }
}
