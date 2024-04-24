package org.example.day08.observerpattern;

/**
 * @author Fickler
 * @date 2024/4/24 10:33
 */
public class OctalObserver extends Observer {
    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
    }
}
