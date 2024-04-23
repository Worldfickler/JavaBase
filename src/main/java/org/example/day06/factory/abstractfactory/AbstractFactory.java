package org.example.day06.factory.abstractfactory;

/**
 * @author Fickler
 * @date 2024/4/22 13:00
 */
public interface AbstractFactory {
    public Engine createEngine();
    public Aircondition createAircondition();
}
