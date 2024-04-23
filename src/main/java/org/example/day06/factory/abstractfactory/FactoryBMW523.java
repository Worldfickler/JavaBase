package org.example.day06.factory.abstractfactory;

/**
 * @author Fickler
 * @date 2024/4/22 13:03
 */
public class FactoryBMW523 implements AbstractFactory{
    @Override
    public Engine createEngine() {
        return new EngineB();
    }

    @Override
    public Aircondition createAircondition() {
        return new AirconditionB();
    }
}
