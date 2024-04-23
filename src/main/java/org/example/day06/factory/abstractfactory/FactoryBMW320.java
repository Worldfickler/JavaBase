package org.example.day06.factory.abstractfactory;

/**
 * @author Fickler
 * @date 2024/4/22 13:02
 */
public class FactoryBMW320 implements AbstractFactory{
    @Override
    public Engine createEngine() {
        return new EngineA();
    }

    @Override
    public Aircondition createAircondition() {
        return new AirconditionA();
    }
}
