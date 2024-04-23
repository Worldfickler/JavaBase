package org.example.day06.factory.factoryfunction;

/**
 * @author Fickler
 * @date 2024/4/22 11:50
 */
public class FactoryBMW320 implements FactoryBMW{
    @Override
    public BMW320 createBMW() {
        return new BMW320();
    }
}
