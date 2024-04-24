package org.example.day08.observerpattern;

/**
 * @author Fickler
 * @date 2024/4/24 10:35
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new BinaryObserver(subject);
        new HexaObserver(subject);
        new OctalObserver(subject);
        System.out.println("first change 15");
        subject.setState(15);
        System.out.println("second change 20");
        subject.setState(20);
    }
}
