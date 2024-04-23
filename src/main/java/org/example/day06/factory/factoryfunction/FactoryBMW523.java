package org.example.day06.factory.factoryfunction;

/**
 * @author Fickler
 * @date 2024/4/22 11:50
 */
public class FactoryBMW523 implements FactoryBMW{
    @Override
    public BMW523 createBMW() {
        return new BMW523();
    }
}
