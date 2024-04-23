package org.example.day06.observer.javaUtil;

/**
 * java 中已经帮我们实现了观察者模式，借助于 java.util.Observable 和 java.util.Observer
 * @author Fickler
 * @date 2024/4/22 9:24
 */
public class Test {
    public static void main(String[] args) {
        SubjectFor3D subjectFor3D = new SubjectFor3D();
        SubjectForSSQ subjectForSSQ = new SubjectForSSQ();
        UserObserver userObserver = new UserObserver();
        userObserver.registerSubject(subjectFor3D);
        userObserver.registerSubject(subjectForSSQ);
        subjectFor3D.setMsg("hello 3d num = 1111");
        subjectForSSQ.setMsg("hello ssq msg = 2222");
    }
}
