package org.example.day06.observer.javaUtil;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Fickler
 * @date 2024/4/22 9:29
 */
public class UserObserver implements Observer {

    public void registerSubject(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof SubjectFor3D) {
            SubjectFor3D subjectFor3D = (SubjectFor3D) o;
            System.out.println("subjectFor3d msg = " + subjectFor3D.getMsg());
        }
        if (o instanceof SubjectForSSQ) {
            SubjectForSSQ subjectForSSQ = (SubjectForSSQ) o;
            System.out.println("subjectForSSQ msg = " + subjectForSSQ.getMsg());
        }
    }
}
